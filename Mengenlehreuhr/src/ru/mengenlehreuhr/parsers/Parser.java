package ru.mengenlehreuhr.parsers;

import ru.mengenlehreuhr.dateformats.BerlinClock;
import ru.mengenlehreuhr.dateformats.Time;

public interface Parser {
	public BerlinClock parse (Time t);
}
