package Week08ResearchAssignment;

//Week 08 Research Assignment
	// Choose at least 2 prompts, research those prompts and write at least one paragraph for two
	// of the prompts.  Include URLs from where you found the information to cite your sources.
	// Submit your Research Results to the LMS.

//Prompt One - Research primary & foreign keys in RDBMSs. What are they?  Why are they useful? 
// The relational database model is one of the most widely used data models in the field of database management systems.
// Relational database models provide the framework for organizing and managing data in a database.
// PRIMARY KEY - What is it?
// Every table in an RDBMS has a primary key. The primary key is a column or a set of columns 
// whose values uniquely identify each row in the table. An RDBMS enforces the uniqueness and integrity of data
// within the table by allowing only one row within a given primary key in a table.
// PRIMARY KEY - Why is it useful?
// Primary keys provide efficient operations, when querying a table using the primary key
// the database can quickly locate the specific row using the index, reducing the amount of search time significantly.
// Primary keys are also very useful in performing updates and deletes. When updating or deleting records, 
// the primary key provides a direct target for the operation that avoids unnecessary processing of data that may be
// irrelevant.
//
// FOREIGN KEY - What is it?
// A foreign key establishes relationships between tables. A foreign key is a column or a set of columns in
// a table whose values correspond to the values of the primary key of another table.
// FOREIGN KEY - Why is it useful?
// Foreign keys are useful in an RDBMS because they ensure data integrity by linking two tables based on specific columns,
// they promote data normalization by avoiding the storage of the same data repeatedly in different tables and 
// they enable efficient data retrieval and manipulation through the use of JOINs that allow you to combine data
// from multiple tables based on the relationships defined by foreign keys.
//
// https://www.ibm.com/docs/en/ida/9.1.2?topic=entities-primary-foreign-keys

//Prompt Two - What are INDEXes in MySQL? 
// INDEXes in MySQL are used to quickly find rows with specific column values. If you don't use an index 
// then MySQL needs to begin at the first row and read through the entire table to find the relevant row and this
// takes longer and is a less efficient way to query. All MySQL data types can be indexed but you don't need 
// to always use INDEXes.

// Why are INDEXes important?
// INDEXes are important because they provide faster data retrieval avoiding having to scan the entire table, 
// they can accelerate sorting and grouping operations when using the Order By or Group By clause and they 
// can enhance JOIN operations between tables allowing MySQL to filter the data more efficiently by reducing the 
// number of rows involved in the query.

// What benefit do they provide?
// Indexes enforce data integrity, for instance unique indexes can prevent duplicate values
// in specific columns ensuring data consistency. By using indexes in your database schema 
// it makes the relationships between tables more explicit and easier to understand.
// Index entries act like pointers to the table rows, allowing the query to quickly determine which
// rows match a condition in the WHERE clause, and retrieve the other column values for those rows. 
//
//Source: https://dev.mysql.com/doc/refman/8.0/en/mysql-indexes.html

//Prompt Three - What is a JOIN when talking about databases?
// Within the context of an RDBMS, JOIN is an operation used to combine data from two or more tables
// based on a shared relationship between them. JOIN allows you to retrieve and analyze data from 
// different tables simultaneously, providing a more comprehensive view of your data.
//
//Source: https://www.mysqltutorial.org/mysql-basics/mysql-join/


public class ResearchAssignment {

}
