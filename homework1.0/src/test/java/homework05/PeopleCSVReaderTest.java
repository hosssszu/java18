package homework05;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;


class PeopleCSVReaderTest {

    @Test
    void fileCheck() {
        File file = new File("Book.csv");
        assertTrue(file.exists());
    }

    @Test
    public void lineLenght() {
        String line = "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";
        String[] player = line.split(",");
        assertEquals(7, player.length);
    }

    @Test
    public void test_no_quote() throws IOException {
        File file = new File("Book.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            String[] tokens = line.split(",");
            line = bufferedReader.readLine();
            assertEquals(7, tokens.length);
        }
    }

    @Test
    public void calculateTotalSeconds() {
        People p = new People(27,"Piotr Smitzer","CZ","1:10","xxxox","xxxxx","xxxxx");
        assertEquals(80,p.second());
    }

    @Test
    public void calculatePenalty() {
        People p2 = new People(27,"Piotr Smitzer","CZ","30:10","xxxox","xxxxx","xxxxx");
        assertEquals(10,p2.second2());
    }

    @Test
    public void calculateTotalTime() {
        People p3 = new People(27,"Piotr Smitzer","CZ","30:10","xxxox","xxxxx","xxxxx");
        assertEquals("30:20",p3.second3());
    }

    @Test
    public void compare() {
        People p4 = new People(27,"Piotr Smitzer","CZ","30:10","xxxox","xxxxx","xxxxx");
        People p5 = new People(1,"Jimmy Smiles","UK","29:15","xxoox","xooxo","xxxxo");
        Comp comp = new Comp();
        assertEquals(1,comp.compare(p4,p5));
    }

}