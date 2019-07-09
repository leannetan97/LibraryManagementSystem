# Library Management System
Fundamental of Programming Assignment WIX1002

## Description
Library Management System is a software that used to manage the different operations required at a library.

### Modules
1. Login module
    * Head Librarian
    * Librarian
    * Members

2. Book management module (Librarian)
    * Add members for registration
    * Add/ Modify/ Delete book categories
    * Add/ Modify/ Delete book entry in a specific category
    * Book-keeping
      *  Change the status of a book from borrowed to available
      * Others
    * Clock in/ Clock out (Librarian)

3. Members management module (Members)
    * Update profile
    * Update Search for a book based on different categories
    * Borrow a book
    * Renew membership

4. Library General Management module (Head Librarian)
    * Generate report of the library operations 

##  Operation performed by Members, Librarians, Head Librarian

| Operation  | Head Librarian  | Librarians  | Members |
|---|---|---|---|
| Update Profile  | Yes | Yes | Yes |
| Add or Delete Librarian  | Yes | No | No |
| Add or Delete Head Librarian | Yes | No | No |
| Add or Delete Member  | Yes | Yes | No |
| Search Book  | Yes | Yes | Yes |
| Renew Membership  | No | No | Yes |
| Generate Access Code <br> (for member to renew membership)  | Yes | Yes | No |
| Add or Delete Book  | Yes | Yes | No |
| Return or Borrow Book  | Yes | Yes | No |
| View Report | Yes | No | No |
| Clock In or Clock Out | No | Yes | No |
| Log Out | Yes | Yes | Yes |

## Contributors
1. Low Jie Fong &nbsp;&nbsp;WIF 160013
2. Tan Lay Yan &nbsp;&nbsp;&nbsp;&nbsp;WIF 160058
3. Lim Ziliang &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;WIF 160014
