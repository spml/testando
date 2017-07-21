import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void test() {
		Pessoa p = new Pessoa("Leuson");
		System.out.println(p.getNome());
		assertEquals("Leuson", p.getNome());
	}

}