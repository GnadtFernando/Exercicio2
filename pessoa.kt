fun main(){
    val primeiroProf = Professor(nome = "Rogerio", CPF = 421421, idProf = 342)
    val primeiroAluno = Aluno(nome = "Fernando", CPF= 123123, numCadastro = 23123)
    println("Professor ${primeiroProf.nome}\nCPF ${primeiroProf.CPF}\nId do Professor ${primeiroProf.idProf}")
    primeiroProf.cursoDoProfessor()
    primeiroProf.ads()

    println("Aluno ${primeiroAluno.nome}\nCPF ${primeiroAluno.CPF}\nNumero do Cadastro ${primeiroAluno.numCadastro}")
    primeiroAluno.hobbieDoAluno()
    primeiroAluno.jogar()

}

open class Pessoa(
    open val nome:String = "",
    open val CPF:Long = 0
)

class Professor(
    nome:String,
    CPF:Long,
    val idProf:Long
): Pessoa(nome,CPF), Cursos {
    override fun cursoDoProfessor() {
        return println("Professor mestra:")
    }
}

class Aluno(
    nome:String,
    CPF:Long,
    val numCadastro:Long
): Pessoa(nome,CPF), Hobbies {
    override fun hobbieDoAluno() {
        return println("O hobbie do aluno é:")
    }
}

interface Cursos {
    fun cursoDoProfessor(){
        return println("ERRO!!")
    }
    fun ads(){
        return println("Analise e desenvolvimento de sistemas\n")
        }
    }


interface Hobbies {
    fun hobbieDoAluno(){
        return println("ERRO!!")
    }

    fun jogar(){
        return println("Jogar\n")
        }
    }