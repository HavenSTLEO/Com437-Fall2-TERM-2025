*******week6 week6 week 6 update ******
## Week 6 Progress Update

- Added a prototype Kotlin `MainActivity.kt` file to represent the main structure of the Android application.
- Added a basic `activity_main.xml` layout file that includes the app title and a placeholder button.
- Created the `GreenIsTheirFavoriteColorPrototype` folder to organize the early development files.
- Updated the Wiki outline and continued aligning the project with the Module 6 requirements.
- This code is a prototype and demonstrates the beginning of app development as required for Week 6.

Please review Below for past updates. 




WEEK1-5 Update 
Green Is Their Favorite Color – Eco Shopping Assistant

Course / Term

Course: COM-437 – Mobile Application Development

Term: Fall 2, 2025

Student: Haven Greene

Project Description This Android app helps shoppers quickly identify more eco-friendly products. Users can search items, view a simple sustainability rating, and save greener choices for future purchases. The goal is to provide clear, non-technical guidance that supports greener shopping habits.

Problem Addressed Shoppers are overwhelmed by confusing “green” labels and marketing. It is hard to know which products are genuinely better for the environment. There is no simple, fast way to compare sustainability while standing in the store. The app solves this by showing a quick rating (for example, a 1–5 “leaf” score or color code) plus a short explanation of why a product earned that rating.

Platform Native Android app Target OS: Android 10+ Devices: Standard Android smartphones Tools: Android Studio, Kotlin or Java (per course requirements) Front-End / Back-End Support Front-End

Android XML layouts following Material Design guidelines Activities and/or Fragments for each major screen RecyclerView for lists (products and favorites) Back-End

Phase 1 (Course Scope): Local mock data (JSON file or Room database) Business logic for rating calculation and basic filtering Phase 2 (Future Enhancement): Optional REST API for real sustainability data Possible cloud backend (e.g., Firebase) Functionality Core features planned for this term:

Home screen with search and category shortcuts Product list screen with name, mini rating, and category Product detail screen with: Product name, brand, and category Sustainability rating (icon/score) Short “Why this rating?” explanation “Add to Favorites” button Favorites screen for saved products Info/Tips screen with simple greener-shopping tips Stretch goals (if time allows):

Barcode scanning to look up products Comparison view between two products Design and Wireframes Wireframes will be:

Hand-drawn first (as required by the course) Recreated using an online tool (e.g., Figma, Balsamiq, or similar) Planned screens:

Splash / Welcome screen Home screen (search + categories + bottom navigation) Product list screen Product detail screen Favorites screen Info / Tips screen Repository Usage This repository will be used to:

Store the Android Studio project for the app Maintain this README as the high-level outline Link to the GitHub Wiki, where more details (design, requirements, progress) will be documented







WEEKS 5/6 

Haven Greene COM437 Dr. Igbonagwam 16NOV2025 Title: Android App Project Outline – Green Is Their Favorite Color (Eco Shopping Assistant) Preface: Dr. Igbonagwam Its shaping up to be another great Term. I am very much looking forward to making this happen. I believe this is the 4th or 5th time I have been lucky enough to take one of your courses. You and I have a GPA of 3.92 AS Professor and student, lets keep it going ! Ha https://github.com/HavenSTLEO/Com437-Fall2-TERM-2025/tree/main I. Project Description A. Working Title: Green Is Their Favorite Color – Eco Shopping Assistant B. Brief Overview

Android app that helps users choose more eco-friendly products while shopping.
Users can search or scan items and view a simple sustainability rating and description.
App focuses on clear, non-technical guidance so everyday shoppers can make greener choices. C. Target Users
Busy consumers who want to reduce their environmental impact.
College students, young professionals, and eco-conscious families. II. Problem Addressing A. Business / Real-World Problem
Shoppers struggle to understand which products are truly eco-friendly.
Product labels are confusing, and “greenwashing” makes decision-making harder. B. User Pain Points
Too much information, not enough clear guidance at the point of purchase.
No quick way to compare sustainability between similar products. C. How the App Addresses the Problem
Provides a simple rating (e.g., color-coded or 1–5 leaf score).
Summarizes why a product is rated that way in plain language.
Lets users save favorite “green” products for future purchases. III. Platform A. Operating System and Devices
Native Android app.
Target OS: Android 10 and above.
Target devices: Standard Android smartphones. B. Development Environment
Android Studio (latest stable version).
Language: Kotlin (or Java, depending on course expectation). C. Distribution (Future Consideration)
Initially for classroom / local APK install.
Future goal: prepare for Google Play Store deployment (if expanded). IV. Front/Back End Support A. Front-End (Client Side)
Native Android UI with XML layouts and Material Design guidelines.
Activities and/or Fragments for each major screen.
RecyclerView for lists of products and favorites. B. Back-End (Data / Logic)
Phase 1 (Course Scope) a. Local mock data in JSON or Room database. b. Basic business logic for rating calculation and filtering.
Phase 2 (Future Enhancement) a. REST API integration with an external sustainability/product database. b. Cloud backend (e.g., Firebase or simple Node/Flask service). V. Functionality A. Core Features (Planned for This Term)
Home screen with quick access to search and categories.
Product search by name or category.
Product detail screen showing: a. Name, brand, and category. b. Sustainability rating (e.g., green/yellow/red or leaf icons). c. Short explanation of rating (e.g., packaging, ingredients, sourcing).
Favorites / Saved Items a. User can bookmark products. b. List of saved eco-friendly choices for repeat purchases. B. Optional / Stretch Features (If Time Allows)
Barcode scanning for quick lookups.
Simple comparison view between two products.
Basic tips page: “5 quick ways to shop greener.” C. Non-Functional Requirements
Simple and responsive UI.
Fast loading of lists and details.
Clear navigation with minimal taps to reach key info. VI. Design (Wireframes) A. Wireframe Overview
Wireframes will be initially hand-drawn on paper, then recreated using an online tool (e.g., Figma, Balsamiq, or similar). B. Planned Screens
Splash / Welcome Screen a. App name and simple tagline. b. “Continue” button to go to Home or Onboarding.
Home Screen a. Top app bar with title and menu icon. b. Search bar for product name. c. Category buttons (e.g., Food, Household, Personal Care). d. Bottom navigation (Home, Favorites, Info).
Product List Screen a. List of products with name, mini rating icon, and category. b. Tapping item opens Product Detail.
Product Detail Screen a. Product name and brand at top. b. Large rating icon / score. c. “Why this rating?” explanation section. d. “Add to Favorites” button.
Favorites Screen a. List of saved products. b. Option to remove from favorites.
Info / Tips Screen a. Short, friendly eco tips. b. About the app and disclaimer. C. Navigation Flow
Splash → Home.
Home → Product List → Product Detail.
Home → Favorites.
Home → Info / Tips.









