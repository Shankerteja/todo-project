# ✅ Java Todo Project  

A **dynamic web-based Todo application** built using **Java (JSP, Servlets), MySQL, Apache Tomcat**, and **XAMPP**. This project allows users to **add, update, delete, and manage tasks efficiently**.

---

## 🚀 Features  
- 📝 Create, update, and delete tasks  
- ✅ Mark tasks as completed  
- 🔑 User authentication (Login/Signup using Sessions)  
- 📂 Data stored in **MySQL** (Managed via XAMPP)  
- 🚀 Deployed on **Apache Tomcat Server**  
- 🎨 Responsive UI with HTML, CSS, and JavaScript  

---

## 🛠️ Tech Stack  

| Component        | Technology Used  |
|-----------------|-----------------|
| **Frontend**    | HTML, CSS, JavaScript (JSP) |
| **Backend**     | Java (Servlets, JSP, JDBC) |
| **Database**    | MySQL (Using XAMPP) |
| **Server**      | Apache Tomcat |
| **IDE**         | Eclipse / IntelliJ / NetBeans |

---

## 🔧 Installation & Setup  

### 1️⃣ Clone the Repository  
To clone this repository, run:  
```sh
git clone https://github.com/Shankerteja/todo-project.git
cd todo-project
```

---

### 2️⃣ Setup MySQL Database (Using XAMPP)  
1. Open **XAMPP Control Panel** and start **Apache & MySQL**  
2. Open **phpMyAdmin** (`http://localhost/phpmyadmin/`)  
3. Create a new database:  
   ```sql
   CREATE DATABASE todo_db;
   ```
4. Import the provided SQL file (`todo_db.sql`) from the `database` folder  

---

### 3️⃣ Configure Database Connection  
Edit **`dbconfig.java`** (Located in `src/config/dbconfig.java`)  
```java
public class DBConfig {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/todo_db";
    public static final String DB_USER = "root"; // Change if needed
    public static final String DB_PASSWORD = ""; // Set password if any
}
```

---

### 4️⃣ Deploy on Tomcat Server  
1. **Open the project in Eclipse/IntelliJ**  
2. **Right-click the project → Run on Server**  
3. **Select Apache Tomcat (Configured with JDK)**  
4. The app should now be running at:  
   ```
   http://localhost:8080/todo-project
   ```

---

### 🖥️ Running Manually (WAR File)  
1. Build a **WAR file** (`todo-project.war`)  
2. Copy it to **Tomcat’s webapps** folder:  
   ```
   C:\Tomcat\webapps\
   ```
3. Restart Tomcat Server  
4. Open `http://localhost:8080/todo-project` in your browser  

---

## 🚀 Deployment (Enterprise Level)  
For **production deployment**, use:  
- **Tomcat Server on AWS/Heroku/VPS**  
- **MySQL Database hosted on AWS RDS or DigitalOcean**  

---

## 📸 Screenshots  
(Add images of your app interface here)  

---

## 🛠️ Troubleshooting  
If you encounter **database connection issues**, ensure that:  
- **MySQL is running in XAMPP**  
- **The database name in `dbconfig.java` matches the one in MySQL**  
- **The MySQL username/password are correct**  

---

## 💡 Future Enhancements  
- 🔐 Implement OAuth (Google Login)  
- 📅 Add due date & task notifications  
- 📊 Analytics for completed & pending tasks  

---

## 🤝 Contributing  
Contributions are welcome! To contribute:  
1. **Fork** the repository  
2. **Create a new branch**:  
   ```sh
   git checkout -b feature-branch
   ```
3. **Commit your changes**:  
   ```sh
   git commit -m "Added new feature"
   ```
4. **Push and open a Pull Request**  

---

## 📜 License  
This project is **open-source** and licensed under the **MIT License**.  

```txt
MIT License

Copyright (c) 2025

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```

---

## 🌟 Show Your Support!  
If you like this project, **star⭐ the repo** and **share it**!  

Happy Coding! 🚀


