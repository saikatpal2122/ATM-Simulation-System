#ATM Simulation System

A Java-based ATM (Automated Teller Machine) simulation built for the Object-Oriented Programming (OOP) course. It models core banking operations — deposit, withdrawal, balance inquiry, PIN change, transaction history, and fast cash — through a layered, object-oriented design, with both a console interface and a Java Swing GUI.

#### Intro

Real ATM software is proprietary, hardware-dependent, and too complex to study directly, so this project provides a simplified, self-contained simulation for practising OOP design. A user logs in with an account number and PIN, and can then perform standard banking operations through either a console menu or a graphical (Swing) interface, both built on the same shared business-logic layer (`Account`, `Transaction`, `ATM`, `FileManager`).

#### Key Features

- **Secure Login** — Authenticates the user against a stored account number and PIN before granting access.
- **Deposit & Withdraw** — Updates the account balance with validation (e.g. rejects withdrawals exceeding the balance).
- **Balance Inquiry** — Displays the current account balance on demand.
- **Change PIN** — Validates the old PIN and enforces PIN format rules before updating it.
- **Transaction History** — Logs every successful operation with a timestamp and lets the user review the full history.
- **Fast Cash** — One-tap withdrawal of preset amounts (500 / 1000 / 2000 / 5000 / 10000 / 20000).
- **Data Persistence** — Account and transaction data are saved to and loaded from local files (`account.txt`, `history.txt`) via a dedicated `FileManager` class.
- **Dual Interface** — The same business-logic layer powers both a console entry point (`ATMSimulationSystem`) and a full Swing GUI (`LoginForm`, `DashboardForm`, and six operation forms).

 

 #### Team Task Distribution
 
| Student Name         | Student ID |               Responsibility                   |
|----------------------|------------|------------------------------------------------|
| Saikat Pal           | 251-15-690 | UI design, `FileManager.java`, and bug fixing  |
| Charif Adnan Khan    | 251-15-117 | `Transaction.java`, `ATM.java`                 |
| Anamika Devnath      | 251-15-616 | `Account.java`, `Customer.java`, `FileManager.java` |
| Rehnuma Rushni       | 251-15-244 | `DepositForm`, `WithdrawForm`                   |
| Israt Jahan Monika   | 251-15-373 | `ATMSimulationSystem.java`, `ChangePINForm`     |


#### Citation & Report

- [1] Oracle, "The Java Tutorials," Oracle Corporation. Available: https://docs.oracle.com/javase/tutorial/
- [2] P. Deitel and H. Deitel, *Java: How to Program*, 11th ed. Pearson, 2017.
- [3] Jon Kleinberg and Eva Tardos. Algorithm design. Pearson Education India, 2006.

The full project report — including UML class diagrams, workflow and sequence diagrams, implementation details, and complex-engineering-problem mapping — is available in " **https://drive.google.com/file/d/10wyKBMwURZXevZ1rz6tdtAIDLbhoCyEb/view?usp=sharing** "


### Instructor

**Course:** CSE222 — Object Oriented Programming Lab

**Submitted To:** _MEZBAUL ISLAM ZION_, _Lecturer_, Department of Computer Science and Engineering, Daffodil International University
