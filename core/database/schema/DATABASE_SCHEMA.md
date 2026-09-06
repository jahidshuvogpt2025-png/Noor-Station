# Noor Station - Database Schema

## Overview

Noor uses a modular data system.
All user data is designed to be portable, secure and future AI-ready.

---

# User Entity

Table: users

Fields:

- id
- username
- email
- avatar
- created_at
- updated_at


Relations:

User
 |
 ├── Profile
 ├── Widgets
 ├── Library Items
 ├── Blog Posts
 ├── Vault Items
 └── Workspace


---

# Profile Entity

Table: profiles

Fields:

- id
- user_id
- name
- bio
- photo
- cv_html
- skills
- education
- experience


Purpose:

Stores user's digital identity and CV system.


---

# Widget Entity

Table: widgets

Fields:

- id
- user_id
- widget_type
- title
- thumbnail
- position_x
- position_y
- width
- height
- theme
- content
- visibility


Purpose:

Dynamic user interface components.


---

# Library Entity

Table: library_items

Fields:

- id
- user_id
- title
- type
- file_path
- thumbnail
- category
- tags
- created_at


Types:

- Book
- Document
- Note
- Media


---

# Blog Entity

Table: blog_posts

Fields:

- id
- user_id
- title
- content
- cover_image
- category
- likes
- comments
- created_at


Purpose:

Public social style publishing.


---

# Vault Entity

Table: vault_items

Fields:

- id
- user_id
- encrypted_data
- file_reference
- security_level
- created_at


Purpose:

Private secure storage.


---

# Workspace Entity

Table: workspaces

Fields:

- id
- user_id
- layout_data
- theme
- settings


Purpose:

Stores complete user dashboard arrangement.


---

# Export Package

User data export format:

JSON Package

Contains:

- Profile
- Widgets
- Library
- Blog
- Vault metadata
- Workspace


---

# Future AI Layer

Reserved fields:

- embeddings
- index_data
- smart_tags
- ai_metadata

AI integration will be added later without changing core structure.
