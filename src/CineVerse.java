import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CineVerse extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    private HashMap<String, String> users = new HashMap<>();
    private String currentUser;
    private double ticketPrice;
    private TicketPanel ticketPanel;

    private HashMap<String, Integer> seatAvailability;
    private HashMap<String, HashMap<String, Integer>> userBookings = new HashMap<>();

    public CineVerse() {
        setTitle("CineVerse - Movie Ticket Booking");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        users.put("admin", "1234");

        initializeSeats();

        LoginPanel login = new LoginPanel(this);
        RegisterPanel register = new RegisterPanel(this);
        MenuPanel menu = new MenuPanel(this);
        ticketPanel = new TicketPanel(this);

        mainPanel.add(login, "login");
        mainPanel.add(register, "register");
        mainPanel.add(menu, "menu");
        mainPanel.add(ticketPanel, "ticket");

        add(mainPanel);
        setVisible(true);
    }

    private void initializeSeats() {
        seatAvailability = new HashMap<>();
        seatAvailability.put("A1", 10);
        seatAvailability.put("A2", 10);
        seatAvailability.put("B1", 10);
        seatAvailability.put("B2", 10);
        seatAvailability.put("C1", 10);
        seatAvailability.put("C2", 10);
    }

    public void showCard(String name) {
        cardLayout.show(mainPanel, name);
    }

    public boolean authenticate(String user, String pass) {
        return users.containsKey(user) && users.get(user).equals(pass);
    }

    public boolean userExists(String user) {
        return users.containsKey(user);
    }

    public void registerUser(String user, String pass) {
        users.put(user, pass);
    }

    public void setCurrentUser(String user) {
        this.currentUser = user;
    }

    public String getCurrentUser() {
        return this.currentUser;
    }

    public void setTicketPrice(double price) {
        this.ticketPrice = price;
    }

    public double getTicketPrice() {
        return this.ticketPrice;
    }

    public void displayTicket(String ticketText) {
        ticketPanel.setTicketText(ticketText);
        showCard("ticket");
    }

    public boolean isSeatAvailable(String seat, int quantity) {
        return seatAvailability.containsKey(seat) && seatAvailability.get(seat) >= quantity;
    }

    public void bookSeats(String seat, int quantity) {
        if (seatAvailability.containsKey(seat)) {
            int current = seatAvailability.get(seat);
            seatAvailability.put(seat, current - quantity);
            if (currentUser != null) {
                if (!userBookings.containsKey(currentUser))
                    userBookings.put(currentUser, new HashMap<>());
                HashMap<String, Integer> bookings = userBookings.get(currentUser);
                bookings.put(seat, bookings.getOrDefault(seat, 0) + quantity);
            }
        }
    }

    public int getAvailableSeats(String seat) {
        return seatAvailability.getOrDefault(seat, 0);
    }

    public void resetSeats() {
        initializeSeats();
        userBookings.clear();
    }

    public boolean cancelBooking(String user, String seat, int quantity) {
        if (user == null || !userBookings.containsKey(user)) return false;
        HashMap<String, Integer> bookings = userBookings.get(user);
        int booked = bookings.getOrDefault(seat, 0);
        if (booked < quantity || quantity <= 0) return false;

        seatAvailability.put(seat, seatAvailability.getOrDefault(seat, 0) + quantity);

        if (booked == quantity) bookings.remove(seat);
        else bookings.put(seat, booked - quantity);

        if (bookings.isEmpty()) userBookings.remove(user);
        return true;
    }

    public Map<String, Integer> getUserBookings(String user) {
        if (user == null || !userBookings.containsKey(user)) return null;
        return new HashMap<>(userBookings.get(user));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CineVerse::new);
    }
}