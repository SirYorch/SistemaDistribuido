--
-- PostgreSQL database dump
--

-- Dumped from database version 17.5
-- Dumped by pg_dump version 17.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: universidades; Type: SCHEMA; Schema: -; Owner: admin
--

CREATE SCHEMA universidades;


ALTER SCHEMA universidades OWNER TO admin;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: universidad; Type: TABLE; Schema: universidades; Owner: admin
--

CREATE TABLE universidades.universidad (
    codigo bigint NOT NULL,
    direccion character varying(255),
    nombre character varying(255),
    telefono character varying(255)
);


ALTER TABLE universidades.universidad OWNER TO admin;

--
-- Name: universidad_seq; Type: SEQUENCE; Schema: universidades; Owner: admin
--

CREATE SEQUENCE universidades.universidad_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE universidades.universidad_seq OWNER TO admin;

--
-- Data for Name: universidad; Type: TABLE DATA; Schema: universidades; Owner: admin
--

COPY universidades.universidad (codigo, direccion, nombre, telefono) FROM stdin;
1	Calle Vieja	UPS	098562145
3	Americas	Catolica	098562145
2	Av. Loja	Estatal	06987654321
\.


--
-- Name: universidad_seq; Type: SEQUENCE SET; Schema: universidades; Owner: admin
--

SELECT pg_catalog.setval('universidades.universidad_seq', 51, true);


--
-- Name: universidad universidad_pkey; Type: CONSTRAINT; Schema: universidades; Owner: admin
--

ALTER TABLE ONLY universidades.universidad
    ADD CONSTRAINT universidad_pkey PRIMARY KEY (codigo);


--
-- PostgreSQL database dump complete
--

