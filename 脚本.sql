--创建数据dev
CREATE DATABASE dev;

--切换到数据库dev
USE dev;

--查看当前正在使用的数据库
select DATABASE();

--查看当前库中存在哪些表
show tables;

--创建Student表
CREATE TABLE student
( id VARCHAR(32) NOT NULL PRIMARY KEY,
  name VARCHAR(15),
  sex VARCHAR(2),
  age INT
)

--查询表
SELECT * from t_student;

--往表中插入记录
insert into student values('100','gaoweigang', '男', '22');