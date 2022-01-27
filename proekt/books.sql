-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Ноя 29 2020 г., 13:42
-- Версия сервера: 10.4.16-MariaDB
-- Версия PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `book`
--

-- --------------------------------------------------------

--
-- Структура таблицы `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `Genre` varchar(30) NOT NULL,
  `price` int(11) NOT NULL,
  `ISBN` bigint(20) NOT NULL,
  `year` int(11) NOT NULL,
  `publisher` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `books`
--

INSERT INTO `books` (`id`, `name`, `author`, `Genre`, `price`, `ISBN`, `year`, `publisher`) VALUES
(1, 'JavaScript', 'David Flanagan', 'Science', 41, 1491952024, 2020, 'O\'Reilly Media'),
(2, 'Data Science', 'Joel Grus', 'Science', 36, 1492041130, 2019, 'O\'Reilly Media'),
(3, 'Deep Learning', 'Jeremy Howard', 'Science', 41, 1492045527, 2020, 'O\'Reilly Media'),
(4, 'Machine Learning', 'Aurelien Geron', 'Science', 38, 1492032646, 2019, 'O\'Reilly Media'),
(5, 'Python', 'Ian Pointer', 'Science', 39, 1492041416, 2019, 'O\'Reilly Media'),
(6, 'The General', 'Gabriel Garcia', 'Literature', 50, 1400034701, 2003, 'Vintage'),
(7, 'Strange Pilgrims', 'Gabriel Garcia', 'Literature', 42, 1400034698, 2020, 'Vintage'),
(8, 'Live to Tell', 'Gabriel Garcia', 'Literature', 36, 1400365284, 2006, 'Vintage'),
(9, 'La hojarasca', 'Gabriel Garcia', 'Literature', 45, 307475697, 2011, 'Vintage'),
(10, 'Collected Novellas', 'Gabriel Garcia', 'Literature', 48, 60932669, 2020, 'Vintage'),
(11, 'Design Decisions', 'Tom Greever', 'Science', 28, 1492079227, 2020, 'O\'Reilly Media'),
(12, 'Level Objectives', 'Alex Hidalgo', 'Science', 38, 1492076813, 2020, 'O\'Reilly Media'),
(13, 'Pytorch', 'Delip Rao', 'Science', 58, 1491978236, 2019, 'O\'Reilly Media'),
(14, 'Deep Learning from Scratch', 'Seth Weidman', 'Science', 39, 1492041416, 2019, 'O\'Reilly Media'),
(15, 'Series Analysis', 'Aileen Nielsen', 'Science', 31, 1492041653, 2019, 'O\'Reilly Media'),
(16, 'Practical Statistcs', 'Peter Bruce', 'Science', 41, 1492072945, 2020, 'O\'Reilly Media'),
(17, 'Learning SQL', 'Alan Beaulieu', 'Science', 37, 1492057614, 2020, 'O\'Reilly Media'),
(18, 'R for Data Science', 'Hadley Wickham', 'Science', 26, 1491910399, 2017, 'O\'Reilly Media'),
(19, 'Learning R', 'Richard Cotton', 'Science', 22, 1449357105, 2013, 'O\'Reilly Media'),
(20, 'Learning Python', 'Mark Lutz', 'Science', 43, 1449355730, 2013, 'O\'Reilly Media'),
(21, 'Love in the Time', 'Gabriel Garcia', 'Literature', 22, 1402264536, 2005, 'Vintage'),
(22, 'News of a Kidnapping', 'Gabriel Garcia', 'Literature', 12, 1400034930, 2008, 'Vintage'),
(23, 'In Evil Hour', 'Gabriel Garcia', 'Literature', 56, 60919647, 1991, 'Vintage'),
(24, 'Elegant SciPy', 'Juan Hunez', 'Science', 19, 9781491922873, 2017, 'O\'Reilly'),
(25, 'Numerical Python', 'Robert Johansson', 'Science', 30, 1484242459, 2018, 'Apress'),
(26, 'Pandas for Everyone', 'Daniel Chen', 'Science', 30, 134546938, 2017, 'Addison-Wesley'),
(27, 'Practical Tableau', 'Ryan Sleeper', 'Science', 25, 1491977310, 2018, 'O\'Reilly Media'),
(28, 'Innovative Tableau', 'Ryan Sleeper', 'Science', 50, 1492075655, 2020, 'O\'Reilly Media'),
(29, 'Visual Analytics', 'Alexander Loth', 'Science', 40, 1119560209, 2019, 'Wiley'),
(30, 'Good Charts', 'Scott Berinato', 'Science', 20, 1633690709, 2016, 'Harvard Review');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
