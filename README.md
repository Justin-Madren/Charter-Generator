# 🎭 Scene and Character Generator

This Java project is a **modular content generator** that builds randomized characters, their backgrounds, and the scenes they're part of. It's designed for **storytelling**, **writing prompts**, **world-building**, or even **simple RPG setups**.

---

## 🚀 Features

- **Character Generation** – Randomized characters with unique traits.
- **Background Generation** – Custom backgrounds that add flavor to your characters.
- **Personality Generation** – Assigns random personalities to deepen character uniqueness.
- **Scene Generation** – Includes random time of day, weather, and number of people in the scene.
- **Interactive Console Interface** – Choose what to generate through a simple command-line interface.
- **Java Swing GUI (In Progress)** – A graphical interface to generate characters with a single click.

---

## 📁 Project Structure

- **CharterGenerator.java** – Generates a character with random traits.
- **BackGroundGenerator.java** – Generates a background for each character.
- **SceneGenerator.java** – Generates a scene with random weather, time of day, and character activity.
- **PersonalityGenerator.java** – Generates a personality profile for each character.
- **UserInterFace.java** – Provides a console interface for user interaction and controls generation flow.
- **CharGenGUI.java** – *(New / In Progress)* Basic Java Swing interface to interact with the generator.

---

## 🖥️ GUI Development (In Progress)

We're currently developing a Java Swing-based GUI to improve usability beyond the console. Current capabilities include:

- A button to generate a character
- Simple layout with a label that updates based on button presses
- Calls existing logic through `UserInterFace.CharterPrinter()`

### Next Steps for the GUI:
- Display character details directly in the window instead of the console
- Add buttons for background and scene generation
- Use `JTextArea` for multi-line, scrollable output
- Add user input options (e.g., number of characters)

---

## 🛠️ Planned Features

- Define **clothing aesthetics**
- Enable **saving scenes and characters to a file**
- Let users **define the number of characters** in a scene
- Improve **input validation and error handling**
- Expand **GUI capabilities**

---