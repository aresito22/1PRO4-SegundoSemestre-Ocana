-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-03-2026 a las 11:52:01
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--
CREATE DATABASE IF NOT EXISTS `biblioteca` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `biblioteca`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores`
--

CREATE TABLE `autores` (
  `autor_id` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `nacionalidad` varchar(50) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `autores`
--

INSERT INTO `autores` (`autor_id`, `nombre`, `nacionalidad`, `fecha_nacimiento`) VALUES
(1, 'Gabriel García Márquez', 'Colombiana', '1927-03-06'),
(2, 'Isabel Allende', 'Chilena', '1942-08-02'),
(3, 'Mario Vargas Llosa', 'Peruana', '1936-03-28'),
(4, 'Julio Cortázar', 'Argentina', '1914-08-26'),
(5, 'Pablo Neruda', 'Chilena', '1904-07-12'),
(6, 'Jorge Luis Borges', 'Argentina', '1899-08-24'),
(7, 'Octavio Paz', 'Mexicana', '1914-03-31'),
(8, 'Carlos Ruiz Zafón', 'Española', '1964-09-25'),
(9, 'Laura Esquivel', 'Mexicana', '1950-09-30'),
(10, 'Camilo José Cela', 'Española', '1916-05-11'),
(11, 'Miguel de Cervantes', 'Española', '1547-09-29'),
(12, 'Federico García Lorca', 'Española', '1898-06-05'),
(13, 'Antonio Machado', 'Española', '1875-07-26'),
(14, 'Juan Rulfo', 'Mexicana', '1917-05-16'),
(15, 'Roberto Bolaño', 'Chilena', '1953-04-28'),
(16, 'William Shakespeare', 'Inglesa', '1564-04-23'),
(17, 'Jane Austen', 'Inglesa', '1775-12-16'),
(18, 'Charles Dickens', 'Inglesa', '1812-02-07'),
(19, 'Virginia Woolf', 'Inglesa', '1882-01-25'),
(20, 'George Orwell', 'Inglesa', '1903-06-25'),
(21, 'J.R.R. Tolkien', 'Inglesa', '1892-01-03'),
(22, 'Agatha Christie', 'Inglesa', '1890-09-15'),
(23, 'Emily Brontë', 'Inglesa', '1818-07-30'),
(24, 'Oscar Wilde', 'Irlandesa', '1854-10-16'),
(25, 'Mary Shelley', 'Inglesa', '1797-08-30'),
(26, 'Ernest Hemingway', 'Estadounidense', '1899-07-21'),
(27, 'Mark Twain', 'Estadounidense', '1835-11-30'),
(28, 'Stephen King', 'Estadounidense', '1947-09-21'),
(29, 'Edgar Allan Poe', '1809-01-19', '0000-00-00'),
(30, 'John Steinbeck', 'Estadounidense', '1902-02-27'),
(31, 'Emily Dickinson', 'Estadounidense', '1830-12-10'),
(32, 'F. Scott Fitzgerald', 'Estadounidense', '1896-09-24'),
(33, 'Ray Bradbury', 'Estadounidense', '1920-08-22'),
(34, 'H.P. Lovecraft', 'Estadounidense', '1890-08-20'),
(35, 'J.D. Salinger', 'Estadounidense', '1919-01-01'),
(36, 'Victor Hugo', 'Francesa', '1802-02-26'),
(37, 'Albert Camus', 'Francesa', '1913-11-07'),
(38, 'Jules Verne', 'Francesa', '1828-02-08'),
(39, 'Simone de Beauvoir', 'Francesa', '1908-01-09'),
(40, 'Marcel Proust', 'Francesa', '1871-07-10'),
(41, 'Haruki Murakami', 'Japonesa', '1949-01-12'),
(42, 'Yukio Mishima', 'Japonesa', '1925-01-14'),
(43, 'Franz Kafka', 'Checa', '1883-07-03'),
(44, 'Hermann Hesse', 'Alemana', '1877-07-02'),
(45, 'Friedrich Nietzsche', 'Alemana', '1844-10-15'),
(46, 'José Saramago', 'Portuguesa', '1922-11-16'),
(47, 'Umberto Eco', 'Italiana', '1932-01-05'),
(48, 'Italo Calvino', 'Italiana', '1923-10-15'),
(49, 'Virginia Woolf', 'Inglesa', '1882-01-25'),
(50, 'James Joyce', 'Irlandesa', '1882-02-02'),
(51, 'Milan Kundera', 'Checa', '1929-04-01'),
(52, 'Orhan Pamuk', 'Turca', '1952-06-07'),
(53, 'Salman Rushdie', 'India', '1947-06-19'),
(54, 'Chinua Achebe', 'Nigeriana', '1930-11-16'),
(55, 'Margaret Atwood', 'Canadiense', '1939-11-18'),
(56, 'Alice Munro', 'Canadiense', '1931-07-10'),
(57, 'Roberto Arlt', 'Argentina', '1900-04-26'),
(58, 'Adolfo Bioy Casares', 'Argentina', '1914-09-15'),
(59, 'Ernesto Sabato', 'Argentina', '1911-06-24'),
(60, 'Juan Carlos Onetti', 'Uruguaya', '1909-07-01'),
(61, 'Mario Benedetti', 'Uruguaya', '1920-09-14'),
(62, 'Carlos Fuentes', 'Mexicana', '1928-11-11'),
(63, 'Elena Poniatowska', 'Mexicana', '1932-05-19'),
(64, 'Rosario Castellanos', 'Mexicana', '1925-05-25'),
(65, 'José Donoso', 'Chilena', '1924-10-05'),
(66, 'Jorge Edwards', 'Chilena', '1931-07-29'),
(67, 'Nicanor Parra', 'Chilena', '1914-09-05'),
(68, 'Clarice Lispector', 'Brasileña', '1920-12-10'),
(69, 'Jorge Amado', 'Brasileña', '1912-08-10'),
(70, 'Paulo Coelho', 'Brasileña', '1947-08-24'),
(71, 'César Vallejo', 'Peruana', '1892-03-16'),
(72, 'Alfredo Bryce Echenique', 'Peruana', '1939-07-19'),
(73, 'José María Arguedas', 'Peruana', '1911-01-18'),
(74, 'Rómulo Gallegos', 'Venezolana', '1884-08-02'),
(75, 'Arturo Uslar Pietri', 'Venezolana', '1906-05-16'),
(76, 'Vicente Huidobro', 'Chilena', '1893-01-10'),
(77, 'Gabriela Mistral', 'Chilena', '1889-04-07'),
(78, 'Miguel Ángel Asturias', 'Guatemalteca', '1899-10-19'),
(79, 'Augusto Roa Bastos', 'Paraguaya', '1917-06-13'),
(80, 'Juan Rulfo', 'Mexicana', '1917-05-16'),
(81, 'José Emilio Pacheco', 'Mexicana', '1939-06-30'),
(82, 'Ricardo Piglia', 'Argentina', '1941-11-24'),
(83, 'César Aira', 'Argentina', '1949-02-23'),
(84, 'Sergio Pitol', 'Mexicana', '1933-03-18'),
(85, 'Fernando Vallejo', 'Colombiana', '1942-10-24'),
(86, 'Leonardo Padura', 'Cubana', '1955-10-09'),
(87, 'Zoé Valdés', 'Cubana', '1959-05-02'),
(88, 'Gioconda Belli', 'Nicaragüense', '1948-12-09'),
(89, 'Eduardo Galeano', 'Uruguaya', '1940-09-03'),
(90, 'Luis Sepúlveda', 'Chilena', '1949-10-04'),
(91, 'Antonio Skármeta', 'Chilena', '1940-11-07'),
(92, 'Ángeles Mastretta', 'Mexicana', '1949-10-09'),
(93, 'Carmen Boullosa', 'Mexicana', '1954-09-04'),
(94, 'Santiago Roncagliolo', 'Peruana', '1975-03-29'),
(95, 'Mario Bellatin', 'Mexicana', '1960-07-23'),
(96, 'Cristina Rivera Garza', 'Mexicana', '1964-10-01'),
(97, 'Jorge Franco', 'Colombiana', '1962-01-01'),
(98, 'Santiago Gamboa', 'Colombiana', '1965-01-01'),
(99, 'Horacio Quiroga', 'Uruguaya', '1878-12-31'),
(100, 'Felisberto Hernández', 'Uruguaya', '1902-10-20'),
(101, 'Ricardo Güiraldes', 'Argentina', '1886-02-13'),
(102, 'Macedonio Fernández', 'Argentina', '1874-06-01'),
(103, 'Salvador Elizondo', 'Mexicana', '1932-12-19'),
(104, 'José Agustín', 'Mexicana', '1944-08-19'),
(105, 'Manuel Puig', 'Argentina', '1932-12-28');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `libro_id` int(11) NOT NULL,
  `titulo` varchar(200) DEFAULT NULL,
  `autor_id` int(11) DEFAULT NULL,
  `isbn` varchar(13) DEFAULT NULL,
  `anio_publicacion` year(4) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `copias_disponibles` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`libro_id`, `titulo`, `autor_id`, `isbn`, `anio_publicacion`, `categoria`, `copias_disponibles`) VALUES
(49, 'Cien años de soledad', 1, '9780307474728', '1967', 'Ficción', 5),
(50, 'El amor en los tiempos del cólera', 1, '9780307387264', '1985', 'Ficción', 3),
(51, 'Crónica de una muerte anunciada', 1, '9780307474729', '1981', 'Ficción', 4),
(52, 'La casa de los espíritus', 2, '9780525433477', '1982', 'Ficción', 6),
(53, 'Eva Luna', 2, '9780553383829', '1987', 'Ficción', 4),
(54, 'Paula', 2, '9780061564903', '1994', 'Biografía', 3),
(55, 'La ciudad y los perros', 3, '9788466333215', '1963', 'Ficción', 4),
(56, 'La fiesta del chivo', 3, '9788490628720', '2000', 'Ficción histórica', 5),
(57, 'Travesuras de la niña mala', 3, '9788420469362', '2006', 'Ficción', 3),
(58, 'El túnel', 4, '9788437604572', '1948', 'Ficción', 4),
(59, 'Rayuela', 4, '9788437604589', '1963', 'Ficción experimental', 5),
(60, 'Veinte poemas de amor', 5, '9788437604596', '1924', 'Poesía', 6),
(61, 'El Aleph', 6, '9788437604602', '1949', 'Ficción', 4),
(62, 'Ficciones', 6, '9788437604619', '1944', 'Ficción', 5),
(63, 'El laberinto de la soledad', 7, '9788437604626', '1950', 'Ensayo', 3),
(64, 'La sombra del viento', 8, '9788408163381', '2001', 'Ficción', 7),
(65, 'Como agua para chocolate', 9, '9788408163398', '1989', 'Ficción', 4),
(66, 'La familia de Pascual Duarte', 10, '9788408163404', '1942', 'Ficción', 3),
(67, 'Don Quijote de la Mancha', 11, '9788408163411', '0000', 'Clásico', 8),
(68, 'Poeta en Nueva York', 12, '9788408163428', '1940', 'Poesía', 4),
(69, 'Campos de Castilla', 13, '9788408163435', '1912', 'Poesía', 5),
(70, 'Pedro Páramo', 14, '9788408163442', '1955', 'Ficción', 6),
(71, 'Los detectives salvajes', 15, '9788408163459', '1998', 'Ficción', 4),
(72, 'Romeo y Julieta', 16, '9788408163466', '0000', 'Teatro', 7),
(73, 'Hamlet', 16, '9788408163473', '0000', 'Teatro', 6),
(74, 'Orgullo y prejuicio', 17, '9788408163480', '0000', 'Ficción', 8),
(75, 'Emma', 17, '9788408163497', '0000', 'Ficción', 5),
(76, 'Oliver Twist', 18, '9788408163503', '0000', 'Ficción', 4),
(77, 'Grandes esperanzas', 18, '9788408163510', '0000', 'Ficción', 5),
(78, 'Mrs. Dalloway', 19, '9788408163527', '1925', 'Ficción', 4),
(79, 'Al faro', 19, '9788408163534', '1927', 'Ficción', 3),
(80, '1984', 20, '9788408163541', '1949', 'Ficción distópica', 9),
(81, 'Rebelión en la granja', 20, '9788408163558', '1945', 'Ficción', 7),
(82, 'El Hobbit', 21, '9788408163565', '1937', 'Fantasía', 10),
(83, 'El Señor de los Anillos', 21, '9788408163572', '1954', 'Fantasía', 8),
(84, 'Asesinato en el Orient Express', 22, '9788408163589', '1934', 'Misterio', 6),
(85, 'Muerte en el Nilo', 22, '9788408163596', '1937', 'Misterio', 5),
(86, 'Cumbres Borrascosas', 23, '9788408163602', '0000', 'Ficción', 4),
(87, 'El retrato de Dorian Gray', 24, '9788408163619', '0000', 'Ficción', 6),
(88, 'Frankenstein', 25, '9788408163626', '0000', 'Terror', 5),
(89, 'El viejo y el mar', 26, '9788408163633', '1952', 'Ficción', 7),
(90, 'Por quién doblan las campanas', 26, '9788408163640', '1940', 'Ficción', 5),
(91, 'Las aventuras de Tom Sawyer', 27, '9788408163657', '0000', 'Ficción', 6),
(92, 'El resplandor', 28, '9788408163664', '1977', 'Terror', 8),
(93, 'It', 28, '9788408163671', '1986', 'Terror', 7),
(94, 'El cuervo', 29, '9788408163688', '0000', 'Poesía', 4),
(95, 'Las uvas de la ira', 30, '9788408163695', '1939', 'Ficción', 5),
(96, 'Libro 194', 1, '9784199154837', '1911', 'Poesía', 9),
(97, 'Libro 527', 12, '9789876859495', '1973', 'Ficción', 3),
(98, 'Libro 414', 20, '9787368206835', '1911', 'Poesía', 1),
(99, 'Libro 433', 3, '9788411733245', '1914', 'Ficción', 1),
(100, 'Libro 929', 55, '9789438121010', '1909', 'Ciencia', 7),
(101, 'Libro 333', 85, '9782164125304', '1967', 'No ficción', 9),
(102, 'Libro 66', 71, '9783150693413', '1957', 'Drama', 6),
(103, 'Libro 480', 83, '9786654783661', '2006', 'Drama', 1),
(104, 'Libro 68', 33, '9784403340932', '1926', 'Biografía', 1),
(105, 'Libro 207', 77, '9782265993759', '2001', 'Misterio', 8),
(106, 'Libro 313', 39, '9789962582727', '2000', 'No ficción', 1),
(107, 'Libro 107', 28, '978642266478', '1960', 'Poesía', 8),
(108, 'Libro 187', 58, '9783101993047', '2001', 'Poesía', 6),
(109, 'Libro 80', 79, '9787037343696', '1918', 'Historia', 8),
(110, 'Libro 870', 8, '9787631893630', '1972', 'Historia', 6),
(111, 'Libro 744', 9, '9781775151688', '1978', 'Historia', 5),
(112, 'Libro 114', 30, '9781463883762', '2003', 'Biografía', 3),
(113, 'Libro 19', 33, '9785722503127', '2008', 'Biografía', 9),
(114, 'Libro 162', 26, '9787835308674', '1919', 'Misterio', 7),
(115, 'Libro 996', 3, '9781165795038', '1963', 'Poesía', 7),
(116, 'Libro 676', 33, '9786197017250', '1913', 'Historia', 1),
(117, 'Libro 410', 78, '9786408616217', '2008', 'Misterio', 8),
(118, 'Libro 447', 90, '9781454664758', '1904', 'Biografía', 6),
(119, 'Libro 607', 36, '9789423063173', '1980', 'Misterio', 3),
(120, 'Libro 883', 70, '9788310014911', '1908', 'Fantasía', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros_autores`
--

CREATE TABLE `libros_autores` (
  `libro_id` int(11) NOT NULL,
  `autor_id` int(11) NOT NULL,
  `rolautor` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci COMMENT='Vinculas los autores y libros ya que es una relación de muchos a muchos';

--
-- Volcado de datos para la tabla `libros_autores`
--

INSERT INTO `libros_autores` (`libro_id`, `autor_id`, `rolautor`) VALUES
(49, 1, NULL),
(50, 1, NULL),
(51, 1, NULL),
(52, 2, NULL),
(53, 2, NULL),
(54, 2, NULL),
(55, 3, NULL),
(56, 3, NULL),
(57, 3, NULL),
(58, 4, NULL),
(59, 4, NULL),
(60, 5, NULL),
(61, 6, NULL),
(62, 6, NULL),
(63, 7, NULL),
(64, 8, NULL),
(65, 9, NULL),
(66, 10, NULL),
(67, 11, NULL),
(68, 12, NULL),
(69, 13, NULL),
(70, 14, NULL),
(71, 15, NULL),
(72, 16, NULL),
(73, 16, NULL),
(74, 17, NULL),
(75, 17, NULL),
(76, 18, NULL),
(77, 18, NULL),
(78, 19, NULL),
(79, 19, NULL),
(80, 20, NULL),
(81, 20, NULL),
(82, 21, NULL),
(83, 21, NULL),
(84, 22, NULL),
(85, 22, NULL),
(86, 23, NULL),
(87, 24, NULL),
(88, 25, NULL),
(89, 26, NULL),
(90, 26, NULL),
(91, 27, NULL),
(92, 28, NULL),
(93, 28, NULL),
(94, 29, NULL),
(95, 30, NULL),
(96, 1, NULL),
(97, 12, NULL),
(98, 20, NULL),
(99, 3, NULL),
(100, 55, NULL),
(101, 85, NULL),
(102, 71, NULL),
(103, 83, NULL),
(104, 33, NULL),
(105, 77, NULL),
(106, 39, NULL),
(107, 28, NULL),
(108, 58, NULL),
(109, 79, NULL),
(110, 8, NULL),
(111, 9, NULL),
(112, 30, NULL),
(113, 33, NULL),
(114, 26, NULL),
(115, 3, NULL),
(116, 33, NULL),
(117, 78, NULL),
(118, 90, NULL),
(119, 36, NULL),
(120, 70, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `prestamo_id` int(11) NOT NULL,
  `libro_id` int(11) DEFAULT NULL,
  `usuario_id` int(11) NOT NULL,
  `fecha_prestamo` date DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`prestamo_id`, `libro_id`, `usuario_id`, `fecha_prestamo`, `fecha_devolucion`, `estado`) VALUES
(2, 49, 100, '2025-03-20', '2025-03-25', 'Devuelto'),
(4, 80, 102, '2025-03-21', '2025-03-25', 'Devuelto'),
(5, 51, 200, '2025-04-03', '2025-04-07', 'Activo'),
(6, 94, 103, '2025-03-25', '2025-03-30', 'Retrasado'),
(7, 94, 104, '2025-04-03', '2025-04-07', 'Activo'),
(8, 92, 102, '2025-03-25', '2025-03-30', 'Devuelto'),
(9, 61, 105, '2025-03-26', '2025-03-30', 'Activo'),
(10, 67, 101, '2025-04-03', '2025-04-08', 'Retrasado'),
(11, 67, 105, '2025-04-03', '2025-04-08', 'Devuelto'),
(12, 79, 103, '2025-04-04', '2025-04-09', 'Activo'),
(13, 82, 107, '2025-04-07', '2025-04-12', 'Activo'),
(14, 65, 108, '2025-04-09', '2025-04-14', 'Retrasado'),
(15, 82, 108, '2025-04-10', '2025-04-15', 'Devuelto'),
(16, 49, 102, '2025-04-09', '2025-04-14', 'Devuelto'),
(17, 82, 109, '2025-05-06', '2025-05-12', 'Activo'),
(18, 92, 119, '2025-05-06', '2025-05-12', 'Activo'),
(19, 58, 108, '2025-05-07', '2025-05-13', 'Activo'),
(20, 55, 109, '2025-05-05', '2025-05-12', 'Devuelto'),
(21, 89, 110, '2025-05-06', '2025-05-12', 'Activo'),
(22, 82, 200, '2025-04-30', '2025-05-06', 'Retrasado'),
(23, 58, 111, '2025-05-05', '2025-05-12', 'Activo'),
(24, 51, 109, '2025-04-29', '2025-05-05', 'Retrasado'),
(25, 89, 112, '2025-04-23', '2025-04-28', 'Retrasado'),
(26, 65, 109, '2025-05-02', '2025-05-07', 'Devuelto'),
(27, 58, 112, '2025-04-09', '2025-04-14', 'Devuelto'),
(28, 61, 110, '2025-04-23', '2025-05-27', 'Devuelto'),
(29, 58, 104, '2025-05-08', '2025-05-14', 'Activo'),
(30, 94, 113, '2025-04-21', '2025-04-25', 'Devuelto'),
(31, 89, 114, '2025-04-30', '2025-05-05', 'Retrasado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario_id` int(11) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `codpostal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario_id`, `apellido`, `codpostal`) VALUES
(100, 'Perez', 5500),
(101, 'Paez', 5500),
(102, 'Velazquez', 5501),
(103, 'Robles', 5501),
(104, 'Perez', 5519),
(105, 'Guiraldes', 5501),
(107, 'Rios', 5500),
(108, 'Ramirez', 5515),
(109, 'Rosaenz', 5500),
(110, 'Estevez', 5500),
(111, 'Melendres', 5515),
(112, 'Kriss', 5517),
(113, 'Gimenez', 5501),
(114, 'Diaz', 5501),
(115, 'Sanchez', 5500),
(116, 'Sanches', 5519),
(117, 'Diaz', 5501),
(118, 'Aspee', 5500),
(119, 'Robeert', 5519),
(200, 'Amin', 5517);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autores`
--
ALTER TABLE `autores`
  ADD PRIMARY KEY (`autor_id`),
  ADD KEY `idx_nombre` (`nombre`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`libro_id`),
  ADD KEY `idx_titulo` (`titulo`),
  ADD KEY `idx_isbn` (`isbn`),
  ADD KEY `idx_categoria` (`categoria`),
  ADD KEY `autor_id` (`autor_id`);

--
-- Indices de la tabla `libros_autores`
--
ALTER TABLE `libros_autores`
  ADD PRIMARY KEY (`libro_id`,`autor_id`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`prestamo_id`),
  ADD KEY `idx_fechas` (`fecha_prestamo`,`fecha_devolucion`),
  ADD KEY `idx_estado` (`estado`),
  ADD KEY `libro_id` (`libro_id`),
  ADD KEY `usuario_id` (`usuario_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autores`
--
ALTER TABLE `autores`
  MODIFY `autor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `libro_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=128;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `prestamo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`autor_id`) REFERENCES `autores` (`autor_id`);

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`libro_id`) REFERENCES `libros` (`libro_id`),
  ADD CONSTRAINT `prestamos_usuario_id` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`usuario_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
