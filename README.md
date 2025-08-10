# Java Interface Example

## 📌 Description
This project demonstrates the use of **interfaces** and **inheritance** in Java.  
A `SmartPhone` class is created which:
- Inherits calling and SMS features from the `Phone` class.
- Implements camera functionality (`ICamera` interface).
- Implements music playback functionality (`MusicPlayer` interface).

This example shows how **multiple functionalities** can be combined in a single class using **multiple interface implementation**.

---

## 📂 Project Structure
interfaceexample/
│
├── Phone.java # Base class with call and SMS functions
├── ICamera.java # Interface for camera functions
├── MusicPlayer.java # Interface for music player functions
├── SmartPhone.java # Class extending Phone and implementing interfaces
└── InterfaceExample.java# Main class to run the program

## Sample Output
Phone call : 
Sending and Reciving SMS : 
SmartPhone given Clicking Photos : 
SmartPhone given Video Recording : 
SmartPhone given Function Can Stop Recording : 
SmartPhone given Music Player Function : 
SmartPhone given Music Stop Function : 
