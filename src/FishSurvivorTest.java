import static org.junit.Assert.*;

import org.junit.Test;

public class FishSurvivorTest {

	@Test
	public void test() {
		FishSurvivor fishSurvivor = new FishSurvivor();
		int[] aRozmiarRyb = {4,3,2,1,5};
		int[] bKierunekPlynieciaRyby = {0,1,0,0,0};
		int zwycieskaRyba = fishSurvivor.solution(aRozmiarRyb, bKierunekPlynieciaRyby);
		assertEquals(zwycieskaRyba, 2);
	}

}
