# 🛒 Java OOP - Shopping System

A Java object-oriented programming project that simulates a simple shopping system where customers can add products to shopping carts and generate bills showing item details and the total amount to pay.

## 📌 Project Overview

The project demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java by modeling a simple store system using four main classes:

- `Item`
- `Cart`
- `Bill`
- `Customer`

The system allows a customer to own carts and bills, add items with quantities to a cart, calculate the total cost, and generate a detailed bill.

## 🏗️ Project Structure

```text
ShoppingSystem
│
├── src
│   ├── Item.java
│   ├── Cart.java
│   ├── Bill.java
│   ├── Customer.java
│   └── Main.java
│
├── .gitignore
└── ShoppingSystem.iml

🧩 Classes

🏷️ Item
Represents a product that can be purchased.
Attributes:
    - name - Product name
    - price - Product price
Main Methods:
    - Constructor
    - Getters and Setters

🛒 Cart
Represents a shopping cart that contains items and their quantities.
Attributes:
    - ArrayList<Item> items
    - ArrayList<Integer> quantities
Main Methods:
    - addItem()
    - removeItem()
    - getTotal()
    - Getters

🧾 Bill
Represents a bill generated from a shopping cart.
Attribute:
    - Cart cart
Main Methods:
    - getTotalAmount()
    - getCart()
    - printBill()

👤 Customer
Represents a customer who can own carts and bills.
Attributes:
    - name
    - ArrayList<Cart> carts
    - ArrayList<Bill> bills
Main Methods:
    - addCart()
    - addBill()
    - Getters and Setter

🔗 Relationships Between Classes
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

The project demonstrates relationships between objects using class attributes and ArrayList collections.

⚙️ Technologies Used
    - ☕ Java
    - 🧱 Object-Oriented Programming (OOP)
    - 📋 ArrayList
    - 💻 IntelliJ IDEA
    - 🔧 Git & GitHub

🧪 Example Output
Customer: Ahmed
Bill
--------------------
Laptop | Quantity: 2 | Price: 1000.0 | Total: 2000.0
Mouse | Quantity: 3 | Price: 50.0 | Total: 150.0
--------------------
Total Amount: 2150.0

🎯 Learning Objectives
This project was created to practice:
    - Classes and Objects
    - Encapsulation
    - Constructors
    - Getters and Setters
    - ArrayList
    - Object Relationships
    - Composition
    - Methods and Object Interaction

👨‍💻 Author
Ahmed Gaber