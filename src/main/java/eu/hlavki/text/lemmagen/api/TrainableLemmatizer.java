/*
 * Copyright (C) 2013 Michal Hlavac <hlavki@hlavki.eu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.hlavki.text.lemmagen.api;

/**
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public interface TrainableLemmatizer extends Lemmatizer {

    void addExample(String word, String lemma);

    void addExample(String word, String lemma, double weight);

    void addExample(String word, String lemma, double weight, String msd);

    void buildModel();
}
