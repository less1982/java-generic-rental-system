# java-generic-rental-system
A polymorphic vehicle rental system utilizing Java Generics and Interfaces to demonstrate decoupled architecture and type-safe object management.

The Goal: To design a scalable rental management system that can handle different types of vehicles (Cars, Vans, Motorcycles) using a single, unified codebase. The objective was to implement a system where new vehicle types can be added without modifying the core rental logic.

The Challenge: In traditional programming, you might write separate rental logic for every vehicle type, which leads to "code smell" and maintenance nightmares. The challenge was to create a "Generic" container that ensures any object being rented follows a strict contract (must have start, drive, and stop methods) while remaining flexible enough to handle any specific vehicle class.

The Solution: I implemented a Java Interface (Vehicle) to define the required behaviour and used Generics with Bounded Type Paramters (<T extends Vehicle>) in the VehicleRental class. This ensures compile-time type safety. By utilizing polymorphism, the rental engine can process any class that implements the Vehicle interface, demonstrating a clean, decoupled architectural pattern.
