package Parsers;

import DateFormats.Mengenlehreuhr;
import DateFormats.Time;

public interface Parser {
	public Mengenlehreuhr parse (Time t);
}
