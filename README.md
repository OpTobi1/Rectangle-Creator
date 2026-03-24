# Rectangle-Creator

## Overview
This is a Java-based console application designed for educational purposes, focusing on rectangle geometry. It allows users to calculate rectangle properties and features an interactive quiz system for students.

## Features
* **Core Calculations:** Calculates the area ($w \cdot h$), perimeter ($2 \cdot h + 2 \cdot w$), and diagonal ($\sqrt{h^2 + w^2}$) of a given rectangle[cite: 98, 99].
* **Interactive Student Quiz:** * Iterates through pre-defined arrays of widths and heights[cite: 102, 107].
  * Prompts the user to input their calculated area, perimeter, and diagonal [cite: 108, 109, 110].
  * Grades the user's answers and outputs a final score [cite: 111, 128].
* **Area Comparison:** Compares three user-defined rectangles and identifies which ones have equal areas[cite: 129, 130, 132].

## File Structure
* `Rectangle1.java`: The core model class representing a rectangle with its properties and calculation methods[cite: 101].
* `RectangleTester.java`: The main execution class containing both the interactive quiz and the area comparison logic.

## How to Run
1. Open your terminal or command prompt.
2. Compile the files: `javac Rectangle1.java RectangleTester.java`
3. Run the application: `java RectangleTester`
