# App Lista de Tarefas com Fragments (Java)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo de lista de tarefas em que todas as telas são **Fragments** trocados dentro de uma única Activity.

## Contexto acadêmico

Exercício aplicado em sala de aula em turma de desenvolvimento mobile do grupo **Ânima Educação**. A Ânima Educação é um conglomerado de instituições de ensino superior brasileiras, do qual fazem parte o Centro Universitário IBMR (Rio de Janeiro) e a UNA (Minas Gerais).

## O que o app faz

- **Lista de tarefas**: mostra um botão para cada tarefa cadastrada e um botão para adicionar novas.
- **Cadastro**: formulário com nome, data, local e descrição da tarefa.
- **Detalhes**: exibe todos os dados da tarefa selecionada.
- Navegação com pilha de volta (*back stack*): o botão voltar retorna ao fragmento anterior.

## Conceitos trabalhados em aula

- `Fragment` e `FragmentManager` (`replace`, `addToBackStack`, `popBackStack`)
- Passagem de argumentos para fragments com `newInstance` e `Bundle`
- Objetos `Serializable`
- Criação de views dinamicamente (botões gerados a partir de uma lista)
- Comunicação entre Fragment e Activity

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- AndroidX Fragment
- `minSdk 28` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppListaDeTarefasFragmentJava.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 28 ou superior.

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
