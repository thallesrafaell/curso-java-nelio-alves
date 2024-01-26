import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // Caminho do arquivo
        String file = "C:\\projetos\\Back-end\\curso-java-nelio-alves\\exercicio_map\\src\\urna.txt";

        // Mapa para armazenar candidatos e votos (usando TreeMap para manter as chaves ordenadas)
        Map<String, Integer> urna = new TreeMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            // Lendo o arquivo linha por linha
            while(line != null){
                // Dividindo cada linha para obter o candidato e os votos
                String[] split = line.split(",");
                String candidato = split[0];
                int votos = Integer.parseInt(split[1]);

                // Verificando se o candidato já está presente no mapa
                if(urna.containsKey(candidato)){
                  // Se sim, atualiza o número de votos do candidato
                  Integer novosVotos = urna.get(candidato) + votos;
                  urna.put(candidato, novosVotos);
                } else {
                    // Se não, adiciona o candidato ao mapa com seus votos
                    urna.put(candidato, votos);
                }

                line = br.readLine();
            }

        }catch (IOException e){
            // Tratamento de exceção para erros de leitura do arquivo
            System.out.println("Error :" + e.getMessage());
        }

        // Criando uma lista de entradas (candidato, votos)
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(urna.entrySet());

        // Ordenando a lista com base nos valores (votos)
        Collections.sort(lista, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));



        // Exibindo os resultados ordenados por votos
        for(Map.Entry<String, Integer> entry : lista){
            System.out.println("Candidato: " + entry.getKey() + ", " + " votos: " +  entry.getValue());
        }
        }





        }



