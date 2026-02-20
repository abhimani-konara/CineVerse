# 🎬 CineVerse - Movie Ticket Booking System

![Java](https://img.shields.io/badge/Java-JDK%2024-orange)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen)
![GUI](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 👥 Group No 05

| 👤 Name | 🆔 Student ID |
|--------|-------------|
| Wethum Lansakara | KIC-DCSAI-251-F-026 |
| Sewmini Dissanayake | KIC-DCSAI-251-F-014 |
| Abhimani Konara | KIC-DCSAI-251-F-028 |

---

## 📌 Introduction

> **CineVerse** is a Java-based desktop application designed to simplify and automate the movie ticket booking process. It allows users to register, log in, browse movies, select seats, and manage their bookings — all through a clean and intuitive graphical user interface.

---

## ❗ Problem Statement

Traditional manual ticket booking systems cause:

- 🕐 Long queues and wasted time
- ❌ Errors in seat allocation
- 📉 Lack of real-time seat availability updates
- 😤 Complicated and frustrating booking experience

✅ **CineVerse** solves all these problems with a fast, simple, and user-friendly desktop solution built with Java and OOP principles.

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🔐 User Login | Secure login with input validation |
| 📝 Registration | New user account creation |
| 🎥 Movie Selection | Choose from available movies |
| 🕐 Showtime Selection | Pick your preferred show time |
| 💺 Seat Selection | Regular and VIP seat options |
| 📊 Live Availability | Real-time seat availability tracking |
| 💰 Price Calculator | Dynamic pricing by movie and seat type |
| 🎫 Ticket Generation | Instant ticket summary after booking |
| ❌ Cancel Booking | Cancel your seats anytime |
| 🔒 Admin Reset | Password-protected seat reset for admin |

---

## 🏗️ System Architecture
```
🎬 CineVerse (Main Frame & Core Logic)
│
├── 🔐 LoginPanel.java        →  Login Screen
├── 📝 RegisterPanel.java     →  Registration Screen
├── 🎥 MenuPanel.java         →  Movie & Seat Selection
└── 🎫 TicketPanel.java       →  Ticket Display & Cancellation
```

---

## 🧠 OOP Concepts Applied

| 💡 Concept | 📖 How It's Used |
|-----------|----------------|
| 🔒 Encapsulation | Private data (users, seats) accessed via public methods |
| 🧬 Inheritance | All GUI panels extend JPanel |
| 🎭 Abstraction | Users click buttons, complex logic is hidden inside |
| 🔄 Polymorphism | ActionListener used differently across all panels |

---

## 💻 Technology Stack

| Technology | Purpose |
|-----------|---------|
| ☕ Java JDK 24 | Core programming language |
| 🖼️ Java Swing | GUI framework |
| 🧩 CardLayout | Screen navigation |
| 🗂️ HashMap | In-memory data management |
| 🔧 IntelliJ IDEA | Development environment |

---

## 💲 Ticket Pricing

| 🎬 Movie | 💺 Regular | 👑 VIP |
|---------|----------|------|
| 🦸 Avengers | $15.00 | $22.50 |
| 🦸 Superman | $12.00 | $18.00 |
| 🦇 Batman | $9.00 | $13.50 |

---

## 🚀 How to Run

**Step 1** — Install Java JDK 17 or above
👉 https://www.oracle.com/java/technologies/downloads/

**Step 2** — Clone this repository
```bash
git clone https://github.com/abhimani-konara/CineVerse.git
```

**Step 3** — Open in IntelliJ IDEA

**Step 4** — Right-click `CineVerse.java` → ▶️ Run

---

## 🔑 Default Admin Login
```
Username : admin
Password : 1234
```

---

## 📁 Project Structure
```
📦 CineVerse/
│
├── 📄 CineVerse.java         →  Main app, core logic & data management
├── 📄 LoginPanel.java        →  Login screen UI & authentication
├── 📄 RegisterPanel.java     →  User registration screen UI
├── 📄 MenuPanel.java         →  Movie selection & booking UI
└── 📄 TicketPanel.java       →  Ticket display & cancellation UI
```

---

## 🔮 Future Improvements

- 🗄️ **Database** — MySQL integration for persistent storage
- 💳 **Payments** — Online payment gateway integration
- 📱 **Mobile App** — Android version for easy access
- 📧 **Notifications** — Email/SMS booking confirmations
- 📊 **Reports** — Admin dashboard with sales reports

---

## 🙏 Acknowledgements

> This project was developed as part of our **Java Programming coursework** at **KIC** to demonstrate real-world application of OOP and GUI concepts using Java Swing.

---

## 📜 License

This project is licensed under the **MIT License**.

---

<div align="center">

### ⭐ If you found this project helpful, please give it a star! ⭐

**🎬 CineVerse — Enjoy Your Movie! 🍿**

</div>
