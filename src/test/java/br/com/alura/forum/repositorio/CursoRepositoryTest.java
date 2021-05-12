package br.com.alura.forum.repositorio;

import br.com.alura.forum.modelo.Curso;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class CursoRepositoryTest {

    @Autowired
    private CursoRepository repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
        // given
        String nomeCurso = "HTML5";
        Curso html5 = new Curso();
        html5.setNome(nomeCurso);
        html5.setCategoria("Programacao");
        entityManager.persist(html5);

        // when
        Curso byNome = repository.findByNome(nomeCurso);

        // then
        Assert.assertNotNull(byNome);
        Assert.assertEquals(nomeCurso, byNome.getNome());
    }

    @Test
    public void naoDeveriaCarregarUmCursoCujoNomeNaoEstejaCadastrado() {
        // given
        String nomeCurso = "Python 3";

        // when
        Curso byNome = repository.findByNome(nomeCurso);

        // then
        Assert.assertNull(byNome);
    }

}