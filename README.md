📖 Weblog - Leetcode Practice Blog
A full-stack weblog platform to track Leetcode practice and share insights
🌟 Features
📝 Users can publish, edit, and delete practice records in Markdown format.
📊 Supports tagging, categorization, and search for articles.
🔐 User authentication with Spring Security & JWT.
🖼️ File storage for images and attachments using Minio.
📈 Statistics dashboard with visit heatmaps & graphs.
🏗️ Dockerized for easy deployment.
🛠️ Tech Stack
Layer	Technologies Used
Backend	Java, Spring Boot, Spring Security, JWT, MyBatis, Redis
Frontend	HTML, CSS, JavaScript (optional, if included)
Database	MySQL
Storage	Minio (object storage for images & files)
DevOps	Docker, Swagger (API testing), Maven, Git
🚀 Installation Guide
1️⃣ Clone the repository
bash
复制
编辑
git clone https://github.com/ekko-sde/weblog.git
cd weblog
2️⃣ Configure environment variables
Create a .env file with the following details (modify as needed):

env
复制
编辑
DB_HOST=localhost
DB_PORT=3306
DB_USER=root
DB_PASS=yourpassword
JWT_SECRET=your_secret_key
MINIO_ENDPOINT=http://localhost:9000
MINIO_ACCESS_KEY=your_access_key
MINIO_SECRET_KEY=your_secret_key
3️⃣ Run with Docker (Recommended)
bash
复制
编辑
docker-compose up -d
4️⃣ Run manually
(1) Start MySQL & Minio services
Ensure MySQL and Minio are running with correct credentials.

(2) Build & run the backend
bash
复制
编辑
mvn clean install
java -jar target/weblog-0.0.1-SNAPSHOT.jar
(3) Access the application
API Documentation: http://localhost:8080/swagger-ui/
Web Interface: http://localhost:8080/
📌 API Endpoints (Example)
Method	Endpoint	Description
POST	/auth/login	User login with JWT
POST	/auth/register	User registration
GET	/posts	Get all blog posts
POST	/posts	Create a new post
PUT	/posts/{id}	Edit a post
DELETE	/posts/{id}	Delete a post
📜 License
This project is licensed under the MIT License. Feel free to use and modify.

🤝 Contributing
Contributions are welcome! Fork the repo, create a new branch, and submit a pull request.

📬 Contact
Author: Jun Dai
Email: jud010@ucsd.edu
GitHub: ekko-sde
🎯 Now you're all set! Just save this as README.md in your project root and push it to GitHub. Let me know if you need any modifications! 🚀🔥
