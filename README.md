# 🛒 Java OOP - Shopping System

> A Java Object-Oriented Programming project that simulates a simple shopping system where customers can add products to shopping carts and generate bills showing item details and the total amount to pay.

---

## 📌 Project Overview

The project demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java by modeling a simple store system using four main classes:

- `Item`
- `Cart`
- `Bill`
- `Customer`

The system allows a customer to own carts and bills, add items with quantities to a cart, calculate the total cost, and generate a detailed bill.

---

## ✨ Features

- 🏷️ Manage products and their prices.
- 🛒 Add and remove items from shopping carts.
- 🔢 Manage item quantities.
- 💰 Calculate the total cost of a cart.
- 🧾 Generate detailed bills.
- 👤 Manage customers, carts, and bills.
- 📊 Display item details and the total amount to pay.

---

## 🧩 Classes

### 🏷️ **`Item`**

Represents a product that can be purchased.

**Attributes:**

- `name` — Product name
- `price` — Product price

**Main Methods:**

- Constructor
- Getters and Setters

---

### 🛒 **`Cart`**

Represents a shopping cart that contains items and their quantities.

**Attributes:**

- `ArrayList<Item> items`
- `ArrayList<Integer> quantities`

**Main Methods:**

- `addItem()`
- `removeItem()`
- `getTotal()`
- Getters

---

### 🧾 **`Bill`**

Represents a bill generated from a shopping cart.

**Attribute:**

- `Cart cart`

**Main Methods:**

- `getTotalAmount()`
- `getCart()`
- `printBill()`

---

### 👤 **`Customer`**

Represents a customer who can own carts and bills.

**Attributes:**

- `name`
- `ArrayList<Cart> carts`
- `ArrayList<Bill> bills`

**Main Methods:**

- `addCart()`
- `addBill()`
- Getters and Setters

---

## 🔗 Class Relationships

```text
Customer
   │
   ├── ArrayList<Cart>
   │
   └── ArrayList<Bill>
             │
             └── Cart
                  │
                  ├── ArrayList<Item>
                  └── ArrayList<Integer>
```

The project demonstrates relationships between objects using class attributes and `ArrayList` collections.

---

## 🧠 OOP Concepts Demonstrated

- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- Composition
- Object Relationships
- `ArrayList` Collections
- Methods and Object Interaction

---

## 🛠️ Technologies Used

<p align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

</p>

---

## 🏗️ Project Structure

```text
ShoppingSystem/
├── src/
│   └── shoppingsystem/
│       ├── Item.java
│       ├── Cart.java
│       ├── Bill.java
│       ├── Customer.java
│       └── Main.java
├── .gitignore
├── README.md
└── ShoppingSystem.iml
```

---

## 📊 Example Output

```text
Customer: Ahmed

Bill
--------------------
Laptop | Quantity: 2 | Price: 1000.0 | Total: 2000.0
Mouse | Quantity: 3 | Price: 50.0 | Total: 150.0
--------------------
Total Amount: 2150.0
```

---

## ▶️ How to Run

1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Run the `main()` method.
4. Add items to the shopping cart.
5. Generate the bill.
6. Review the calculated total in the console.

---

## 🎯 Learning Objective

The purpose of this project is to strengthen practical understanding of **Java Object-Oriented Programming** by building a simple shopping system.

The project provides practical experience with:

- Designing classes and objects.
- Applying encapsulation and composition.
- Creating relationships between objects.
- Managing collections using `ArrayList`.
- Calculating totals using object data.
- Implementing methods for object interaction.

---

## 👨‍💻 Author

**Ahmed Gaber**