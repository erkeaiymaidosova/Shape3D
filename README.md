#Description 
n this project, we create 3D shapes like Sphere, Cylinder, and Cube. Each shape can calculate its surface area and volume. We use an interface called Shape3DInterface that requires each shape to have two methods: surfaceArea() and volume(). The project randomly creates 3D shapes, calculates their surface area and volume, and then shows the results.

Polymorphism is used in this project by having different classes (Sphere, Cylinder, and Cube) implement the same interface Shape3DInterface. Each class provides its own implementation of the surfaceArea() and volume() methods, depending on the specific formula for that shape. This allows the program to treat all shapes as instances of Shape3DInterface, but each shape calculates its own surface area and volume in its own way. This is an example of method overriding, a key aspect of polymorphism, where the same method name behaves differently depending on the object type.

For example, when generating random shapes, the program doesn't need to know whether it's dealing with a Sphere, Cylinder, or Cube. It simply calls surfaceArea() and volume() on the shape object, and the appropriate method is executed for the specific type of shape, thanks to polymorphism.


<img width="1060" alt="Снимок экрана 2024-11-28 в 01 12 43" src="https://github.com/user-attachments/assets/0d745b4f-b9b4-4d28-bacf-ea7907bde36d">
<img width="1027" alt="Снимок экрана 2024-11-28 в 01 12 56" src="https://github.com/user-attachments/assets/afde3d79-7648-46f3-8f52-fa77618b5f6c">
<img width="1174" alt="Снимок экрана 2024-11-28 в 01 13 05" src="https://github.com/user-attachments/assets/e760310b-4865-409a-8820-d52b19cf0df7">
<img width="1179" alt="Снимок экрана 2024-11-28 в 01 13 13" src="https://github.com/user-attachments/assets/6c219ac3-e308-4490-806b-ce7aeee04cee">
