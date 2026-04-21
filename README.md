# 💰 Loan Calculator with Extra Payments (Java)

## 📌 Project Overview
This project is a Java console application that calculates loan payments and analyzes how extra payments impact total interest and loan payoff time.

The program simulates real-world loan repayment scenarios by calculating monthly payments and comparing different extra payment strategies.

---

## 🎯 Objectives
- Apply Java programming concepts to a real-world financial problem
- Understand loan amortization and interest calculations
- Practice working in a team environment using GitHub
- Implement and test algorithms using loops and conditional logic

---

## ⚙️ Features

### ✅ Inputs
- Loan amount
- Annual interest rate
- Loan term (years)
- Extra payment amount

### ✅ Outputs
- Monthly payment
- Total interest paid
- Interest saved
- Total months to pay off loan

---

## 🔍 Scenarios Covered

### 1. No Extra Payment
- Calculates standard loan repayment
- Outputs total interest and payoff time

### 2. Extra Payment (First Month Only)
- Applies a one-time extra payment
- Shows reduced interest and payoff time

### 3. Extra Payment (Every Month)
- Applies extra payment monthly
- Shows significant savings in interest and time

---

## 🧠 How It Works

The program simulates loan repayment month-by-month using a loop:

1. Interest is added to the remaining balance
2. Monthly payment (and extra payment if applicable) is applied
3. Balance is reduced
4. Process repeats until loan is fully paid

---

## 🧮 Formula Used

Monthly Payment Formula:

M = P * [r(1 + r)^n] / [(1 + r)^n - 1]

Where:
- M = Monthly payment  
- P = Loan amount  
- r = Monthly interest rate  
- n = Total number of payments (months)  

---

## 🧪 Test Cases

### Loan 1
- Loan Amount: $20,000  
- Interest Rate: 5%  
- Term: 4 years  
- Extra Payment: $1000  

### Loan 2
- Loan Amount: $300,000  
- Interest Rate: 5%  
- Term: 30 years  
- Extra Payment: $1000  

---

## 📁 Project Structure

src/
  Main.java
  LoanCalculator.java
  PaymentCalculator.java
  LoanSimulation.java
docs/
  Project_Description.docx

---

## 👥 Team Responsibilities

- Project Setup & Integration – Repository setup, main program flow, output formatting  
- Payment Calculation – Monthly payment formula and base loan setup  
- Loan Simulation – Core logic using loops to calculate balance and interest  
- Extra Payment Logic – Implement and test extra payment scenarios  

---

## 🧪 How to Run

1. Clone the repository
2. Open the project in your Java IDE (IntelliJ, Eclipse, etc.)
3. Run Main.java
4. Enter input values when prompted (if applicable)

---

## 📸 Deliverables

- Java source code files (.java)
- Project description document (.docx)
- Screenshots of program output
- Demo video presentation

---

## 📊 Learning Outcomes

- Improved understanding of loops and conditionals
- Experience with financial calculations in code
- Practice with GitHub collaboration
- Exposure to real-world problem solving using Java

---

## 🚫 Restrictions
- No GUI frameworks (JavaFX, Swing, AWT)
- Console-based application only

---

## 📌 Notes
This project was completed as part of a group assignment for Advanced Java Programming.
