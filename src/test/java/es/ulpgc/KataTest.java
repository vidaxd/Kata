package es.ulpgc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KataTest {
    @Test
    public void given_a_empty_char_chain_should_be_return_a_empty_char_chain() {
        assertThat(Kata.accum("")).isEqualTo("");
    }

    @Test
    public void given_a_char_chain_should_be_return_a_char_chain_accumulated() {
        assertThat(Kata.accum("SigMar")).isEqualTo("S-Ii-Ggg-Mmmm-Aaaaa-Rrrrrr");
    }

    @Test
    public void given_a_upper_case_char_chain_should_be_return_a_char_chain_accumulated() {
        assertThat(Kata.accum("BANKAI")).isEqualTo("B-Aa-Nnn-Kkkk-Aaaaa-Iiiiii");
    }

    @Test
    public void given_a_lower_case_char_chain_should_be_return_a_char_chain_accumulated() {
        assertThat(Kata.accum("david")).isEqualTo("D-Aa-Vvv-Iiii-Ddddd");
    }


}
