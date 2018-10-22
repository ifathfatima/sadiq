package Lab_4;					//4.1 sirs    half prog

import java.util.Random;
import java.util.Scanner;
 
public class AccountAgain {
               
                private long accNum = 1000;
                private double balance;
                private Person1Again accHolder;
               
                AccountAgain()
                {
                                accNum++;
                }
                public long getAccNum() {
                                return accNum;
                }
                public void setAccNum(long accNum) {
                                this.accNum = accNum;
                }
                public double getBalance() {
                                return balance;
                }
                public void setBalance(double balance) {
                                this.balance = balance;
                }
                public Person1Again getAccHolder() {
                                return accHolder;
                }
                public void setAccHolder(Person1Again accHolder) {
                                this.accHolder = accHolder;
                }
               
                public void deposit(double amount) {
                                balance = balance + amount;
                }
               
                public void withdraw(double amount) {
                                if (balance >= amount) {
                                                balance = balance - amount;
                                } else {
                                                System.out.println("no sufficient funds");
                                }
                }
               
               
               
                @Override
                public String toString() {
                                return "Account Number: " + accNum  + "\naccHolder: " + getAccHolder().getName() + " \nbalance: " + getBalance();
                }
                public static void main(String[] args) {
                                //a. create account for smith and kathy
                                AccountAgain accounts[] = new AccountAgain[100];
                                Scanner sc = new Scanner(System.in);
                               
                                int i = 0;
                                AccountAgain ac = null;
                                long accountNum = 0;
                                while (true) {
                                                System.out.println("1. Create Account");
                                                System.out.println("2. Deposit");
                                                System.out.println("3. Withdraw");
                                                System.out.println("4. Check Balance");
                                                System.out.println("5. Exit");
                                                System.out.println("enter your choice");
                                                int choice = sc.nextInt();
                                                switch(choice) {
                                                case 1:
                                                                Random r = new Random();
                                                                int n = r.nextInt(99999) + 1001;
                                                                Person1Again p = new Person1Again();
                                                                System.out.println("Enter name to create account");
                                                                p.setName(sc.next());
                                                                ac = new AccountAgain();
                                                                System.out.println("enter initial bal to create account");
                                                                ac.setBalance(sc.nextDouble());
                                                                ac.setAccNum(n);
                                                                ac.setAccHolder(p);
                                                                accounts[i] = ac;
                                                                i++;
                                                                System.out.println(ac);
                                                                break;
                                                case 2:
                                                                System.out.println("enter account number to deposit");
                                                                accountNum = sc.nextLong();
                                                                System.out.println("enter amount to deposit");
                                                                double amount = sc.nextDouble();
                                                                for (int k = 0; k < i; k++) {
                                                                                AccountAgain a = accounts[k];
                                                                                if (a.accNum == accountNum) {
                                                                                                a.deposit(amount);
                                                                                }
                                                                }
                                                                break;
                                                case 3:
                                                                System.out.println("enter account number");
                                                                accountNum = sc.nextLong();
                                                                System.out.println("enter amount");
                                                                amount = sc.nextDouble();
                                                                for (int j = 0; j < i; j++) {
                                                                                AccountAgain a = accounts[j];
                                                                                if (a.getAccNum() == accountNum) {
                                                                                                a.withdraw(amount);
                                                                                }
                                                                }
                                                                break;
                                                case 4:
                                                                System.out.println("enter account number to see balance");
                                                                accountNum = sc.nextLong();
                                                                for (int j = 0; j < i; j++) {
                                                                                AccountAgain a = accounts[j];
                                                                                if (a.getAccNum() == accountNum) {
                                                                                                System.out.println(a);
                                                                                }
                                                                }
                                                                break;
                                                case 5:
                                                                sc.close();
                                                                System.exit(0);
                                                }
                                               
                                }
                               
                               
                }
               
 
}