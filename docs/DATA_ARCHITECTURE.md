# Noor Station - Data Architecture

## Vision

Noor is a Personal Digital Universe system.
The core data architecture is designed to support:
- Personal profile
- Digital library
- Public blog
- Private vault
- Workspace
- Custom widgets
- Future AI integration

---

# Core Entity System

## User

Main identity object.

Properties:

- id
- username
- email
- avatar
- profileId
- settingsId
- createdAt

Relations:

User
 ├── Profile
 ├── Widgets
 ├── Library
 ├── Blog
 ├── Vault
 └── Workspace


---

# Profile System

Profile is a customizable digital identity.

Features:

- Name
- Bio
- Photo
- CV
- Skills
- Education
- Experience
- HTML based custom design


---

# Widget Engine

Widgets are the main interface components.

Each widget contains:

- id
- type
- title
- thumbnail
- positionX
- positionY
- width
- height
- theme
- content
- permission


Supported widgets:

- Profile Widget
- Library Widget
- Blog Widget
- News Widget
- Browser Widget
- Vault Widget


---

# Library System

Digital knowledge management.

Supports:

- Books
- Documents
- Notes
- Media
- Tags
- Collections


---

# Private Vault

Secure personal storage.

Features:

- Encrypted data
- Private files
- Password protection
- Local storage support


---

# Blog System

Public social style publishing.

Features:

- User posts
- Comments
- Likes
- Categories
- Profile connection


---

# Export Import System

User owns their data.

Supports:

- JSON export
- Backup package
- Data migration
- Restore system


---

# AI Ready Architecture

AI is not part of the first core release.

But system will keep:

- AI service layer
- Data indexing
- Smart search support
- Future assistant integration


---

# Future Platforms

Supported targets:

- Android
- Tablet
- Desktop
- Web
