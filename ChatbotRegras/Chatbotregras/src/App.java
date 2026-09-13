import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean conversando = true;
        String estado = "NORMAL";

        System.out.println("ASSISTENTE JOGOS, GAMES E JUEGOS");
        System.out.println("Bot: Olá! Sou o assistente da loja Jogos, Games e Juegos.");
        System.out.println("Bot: Como posso ajudar você hoje?");

        while (conversando) {
            System.out.print("Você: ");
            
            String mensagem = scanner.nextLine().toLowerCase().trim();

            if (estado.equals("AGUARDANDO_NOME_JOGO")) {
                System.out.println("Bot: Excelente! Verifiquei no sistema e temos '" + mensagem + "' em estoque. O seu pedido foi reservado para retirada na loja.");
                estado = "NORMAL";
                continue;
            }

            if (mensagem.contains("tchau") || mensagem.contains("sair") || mensagem.contains("encerrar")) {
                System.out.println("Bot: Obrigado por visitar a Jogos, Games e Juegos! Até a próxima!");
                conversando = false; 
            }
            else if (mensagem.contains("oi") || mensagem.contains("olá") || mensagem.contains("ola")) {
                System.out.println("Bot: Olá! Você pode consultar nossos jogos, horários, localização, preços ou reservar um título.");
            }
            else if (mensagem.contains("catálogo") || mensagem.contains("catalogo") || mensagem.contains("lista") || mensagem.contains("jogos")) {
                System.out.println("Bot: Temos vários títulos em destaque no momento, como The Witcher, Disco Elysium, Pokémon Emerald e Overwatch!");
            }
            else if (mensagem.contains("horário") || mensagem.contains("horario") || mensagem.contains("funcionamento")) {
                System.out.println("Bot: Nossa loja física funciona de segunda a sábado, das 09h às 20h.");
            }
            else if (mensagem.contains("endereço") || mensagem.contains("endereco") || mensagem.contains("localização") || mensagem.contains("ficam")) {
                System.out.println("Bot: Ficamos localizados na Avenida dos Gamers, 404, Centro.");
            }
            else if (mensagem.contains("preço") || mensagem.contains("preco") || mensagem.contains("valor") || mensagem.contains("custam")) {
                System.out.println("Bot: Os preços variam bastante. Títulos clássicos custam a partir de R$ 50,00 e os lançamentos a partir de R$ 250,00.");
            }
            else if (mensagem.contains("tem") && (mensagem.contains("console") || mensagem.contains("videogame"))) {
                System.out.println("Bot: Sim, além de jogos, também vendemos consoles novos e seminovos com garantia da loja.");
            }
            else if (mensagem.contains("comprar") || (mensagem.contains("reservar") && mensagem.contains("jogo"))) {
                System.out.println("Bot: Perfeito! Qual é o nome do jogo que você deseja reservar?");
                estado = "AGUARDANDO_NOME_JOGO";
            }
            else {
                System.out.println("Bot: Desculpe, não entendi sua dúvida. Posso informar sobre nosso catálogo, horários, preços ou reservar um jogo para você.");
            }
        }
        
        scanner.close();
    }
}