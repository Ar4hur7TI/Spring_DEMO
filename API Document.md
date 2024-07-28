# Introduction

This is API document for a Spring boot framework project demo. This demo shows how to create a back-end with RESTful and using maven to manage.

@since: 2024-07-28

@version: v0.0.1

# APIs

## Student

### addStudent

| Name           | Value                       |
| -------------- | --------------------------- |
| Route          | /student                    |
| Pre-condition  | 1.                          |
| Post-condition | 1.                          |
| Description    | Add one student information |

request

```json
{
    "name": "Bob",
    "email": "bob@123.com",
    "age": 20
}
```

ok

```json
{
    "data": 3,
    "success": true,
    "errorMsg": null
}
```

### deleteStudent

| Name           | Value              |
| -------------- | ------------------ |
| Route          | /student/{id}      |
| Pre-condition  | 1.student exists   |
| Post-condition | 1.                 |
| Description    | Delete one student |

request

```json
{
    
}
```

ok

```json
{

}
```

### editStudent

| Name           | Value                           |
| -------------- | ------------------------------- |
| Route          | /student/{id}                   |
| Pre-condition  | 1.student exists                |
| Post-condition | 1.                              |
| Description    | Edit the information of student |

request

The request should be of type `multipart/form-data` and include the following parameters:

| Parameter Name | Type   | Description          | Example       |
| -------------- | ------ | -------------------- | ------------- |
| name           | String | The student's name   | 'Bob'         |
| email          | String | The student's e-mail | 'bob@123.com' |

ok

```json
{
    "data": {
        "id": 1,
        "name": "Bob",
        "email": "bob@123.com"
    },
    "success": true,
    "errorMsg": null
}
```

### deleteStudent

| Name           | Value              |
| -------------- | ------------------ |
| Route          | /student/{id}      |
| Pre-condition  | 1.student exists   |
| Post-condition | 1.                 |
| Description    | Delete one student |

request

```json
{

}
```

ok

```json
{

}
```

