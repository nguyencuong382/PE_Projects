Create database Y18S2B1
GO
USE Y18S2B1
GO
CREATE TABLE [dbo].[Groups](
	[GroupID] [int] IDENTITY(1,1) NOT NULL primary key,
	[GroupName] [nvarchar](max) NOT NULL,
	[StartDate] [date] NOT NULL,
	[Status] [bit] NULL
)
GO
insert into [Groups] values('SE1114','02/05/2017',1)
insert into [Groups] values('SE1111','09/05/2017',0)
insert into [Groups] values('SB1212','11/30/2017',0)
GO
CREATE TABLE [dbo].[Student](
	[StudentID] [nvarchar](10) NOT NULL primary key,
	[StudentName] [nvarchar](30) NOT NULL,
	[Address] nvarchar(150) not NULL,
	[Status] [bit] NULL,
	[GroupID] [int] NULL references [Groups](GroupID)
)
GO
insert into Student values('SE05050','Nam Nguyen','Ha Noi',1,1)
insert into Student values('SE04831','Van Khanh','Ha Tay',0,1)
insert into Student values('SB01202','Ha My','Ninh Binh',0,3)
Go

CREATE TABLE [dbo].[Instructor](
	[InstructorID] [nvarchar](10) NOT NULL,
	[InstructorName] [nvarchar](30) NOT NULL,
	[Address] nvarchar(150) not NULL,
	[Status] [bit] NULL,
	[GroupID] [int]  references [Groups](GroupID),
	primary key([InstructorID],[GroupID])
)
GO
insert into [Instructor] values('CauPD','Phan Dang Cau','Ha Noi',1,1)
insert into [Instructor] values('SangNV','Nguyen Van Sang','Ha Tay',0,2)
insert into [Instructor] values('DuyDT','Dao Trong Duy','Ha Nam',1,2)
 