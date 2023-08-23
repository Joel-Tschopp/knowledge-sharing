package DesignPattern.Bridge;

import DesignPattern.Bridge.abstractions.AmericanRestaurant;
import DesignPattern.Bridge.abstractions.ItalianRestaurant;
import DesignPattern.Bridge.abstractions.Restaurant;
import DesignPattern.Bridge.implementations.PepperoniPizza;
import DesignPattern.Bridge.implementations.VeggiePizza;

public class AnotherExample {

    // How not to
    class Circle {
        void drawWithOpenGL() {
            // Code zum Zeichnen eines Kreises mit OpenGL
        }

        void drawWithSVG() {
            // Code zum Zeichnen eines Kreises mit SVG
        }
    }

    class Square {
        void drawWithOpenGL() {
            // Code zum Zeichnen eines Quadrats mit OpenGL
        }

        void drawWithSVG() {
            // Code zum Zeichnen eines Quadrats mit SVG
        }
    }

    //How to
    interface DrawingAPI {
        void drawCircle();
        void drawSquare();
    }

    class OpenGLDrawingAPI implements DrawingAPI {
        void drawCircle() {
            // Code zum Zeichnen eines Kreises mit OpenGL
        }

        void drawSquare() {
            // Code zum Zeichnen eines Quadrats mit OpenGL
        }
    }

    class SVGDrawingAPI implements DrawingAPI {
        void drawCircle() {
            // Code zum Zeichnen eines Kreises mit SVG
        }

        void drawSquare() {
            // Code zum Zeichnen eines Quadrats mit SVG
        }
    }

    // Abstraktionsseite
    abstract class Shape {
        protected DrawingAPI drawingAPI;

        Shape(DrawingAPI drawingAPI) {
            this.drawingAPI = drawingAPI;
        }

        abstract void draw();
    }

    class CircleShape extends Shape {
        CircleShape(DrawingAPI drawingAPI) {
            super(drawingAPI);
        }

        void draw() {
            drawingAPI.drawCircle();
        }
    }

    class SquareShape extends Shape {
        SquareShape(DrawingAPI drawingAPI) {
            super(drawingAPI);
        }

        void draw() {
            drawingAPI.drawSquare();
        }
    }
}
