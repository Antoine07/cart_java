# Cart SOLID 

SRP et programmation par contract

```txt
cart/
├── domain/
│   ├── Cart.java
│   └── CartStorage.java      // interface
│
├── model/
│   ├── Product.java    // classe abstraite
│   ├── Bike.java
│   └── Car.java
│
├── storage/
│   ├── ListCartStorage.java
│   └── MapCartStorage.java
│
└── Main.java
```