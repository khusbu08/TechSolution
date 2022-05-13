package com.TechSolution;

import java.awt.*;

public class Circle {
    Point center;
    double radius;

    double Circle() {
        Object Center;
        Circle(Point Center, double Radius) {
            this.center = center;
            this.radius = radius;
            
        }
        double getPerimeter() {
            return 2 * Math.PI * this.radius;
        }
        double getArea() {
            return Math.PI * this.radius * this.radius;
        }
        void setCenter(Point center) {
            this.center = center;
        }
        void setRadius(double radius) {
            this.radius = radius;
        }
    }
}
