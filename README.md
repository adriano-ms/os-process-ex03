3. No universo do Sistema operacional Linux existem diversas distribuições. Os comandos Java System.getProperty(“os.name”) e System.getProperty(“os.version”) trazem dados sobre o Kernel Linux, mas não sobre a distribuição. Criar em Eclipse, um novo Java Project com uma classe chamada DistroController.java no package controller e uma classe Main.java no package view.

A classe DistroController.java deve ter 2 métodos.

- O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo privado)
- O segundo, chamado exibeDistro, que verifica o SO e, se for Linux, selecione o comando para exibir as propriedades da distribuição. Deve-se exibir o nome e a versão da distribuição. Caso o SO não seja Linux, exibir uma mensagem comunicando.

A classe Main.java deve ter um chamado para a exibição das informações
