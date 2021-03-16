/* -*- Mode: C; indent-tabs-mode: t; c-basic-offset: 4; tab-width: 4 -*-  */
/*
 * Buch.java
 * Copyright (C) 2021 Benjamin Oppermann <ben.opp@eml.cc>
 * 
 * Buechersammlung is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Buechersammlung is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//import java.util.ArrayList;

class Buch {
	 private String autor;
	 private String verlag;
	 private String[] schlagwoerter = {};

	 public Buch (String writer, String publisher, String[] tags) {
		 this.autor = writer;
		 this.verlag = publisher;
		 this.schlagwoerter = tags;
	 }

	 public String[] addTag (String tag) {
		 schlagwoerter.add(tag);
	 }

	 public static void main(String[] args) {

		// addTag("classic", "children");

		Buch alice = new Buch("Carroll", "Randomhouse");				 
	 }
}

