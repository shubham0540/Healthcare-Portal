# Healthcare Portal

Simple healthcare portal project containing a Java Spring Boot backend and a Vite + React frontend.

## Structure
- `backend/` — Spring Boot application (Maven)
- `frontend/` — Vite + React client

## Prerequisites
- Java 17 (or matching `java.version` in `backend/pom.xml`)
- Node.js (>=16) and npm or pnpm
- Git (optional)

## Database configuration
You must provide your database credentials in the backend properties file before running the application. Edit [backend/src/main/resources/application.properties](backend/src/main/resources/application.properties) and set the following properties with your MySQL credentials:

- `spring.datasource.username` — your database username
- `spring.datasource.password` — your database password

Example lines in `application.properties`:

```properties
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
```

Make sure your MySQL server is running and accessible at the URL defined by `spring.datasource.url` (default is `jdbc:mysql://localhost:3306/healthCare_Db`).

## Run (development)

Start the backend (using the Maven wrapper):

Windows (Command Prompt / PowerShell):

```powershell
cd backend
.\mvnw.cmd spring-boot:run
```

macOS / Linux:

```bash
cd backend
./mvnw spring-boot:run
```

Or build and run the jar:

```bash
cd backend
./mvnw package
java -jar target/backend-0.0.1-SNAPSHOT.jar
```

Start the frontend (Vite):

```bash
cd frontend
npm install
npm run dev
```

Once both are running, open the frontend address shown by Vite (usually http://localhost:5173) and the backend runs on port 8080 by default.

## Build for production

Frontend:

```bash
cd frontend
npm run build
```

Backend:

```bash
cd backend
./mvnw package
```

Serve the built frontend (`frontend/dist`) using any static file server, or integrate into the backend static resources as desired.

## Notes
- Backend artifactId and version from `backend/pom.xml` produce `target/backend-0.0.1-SNAPSHOT.jar`. Adjust the jar name if you change `artifactId` or `version`.
- If using Windows, prefer `mvnw.cmd` when running the Maven wrapper.

---
