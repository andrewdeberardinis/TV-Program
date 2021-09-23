import java.util.ArrayList;
public class ProgramMaker
	{

		static ArrayList <Program> TVShows = new ArrayList <Program>();
		
		
		public static void main(String[] args)
			{
			addingPrograms();
			printList();
				
				
			}	
				
				
		public static void addingPrograms()
		{
			TVShows.add(new Program("Soccer Show", "Sports", 3));
			TVShows.add(new Program("Finding Bigfoot", "Adventure", 10));
			TVShows.add(new Program("Cooking with Andrew", "Food", 24));
			TVShows.add(new Program("How to Code", "Educational", 1));
			TVShows.add(new Program("Street Outlaws", "Racing", 6));
			
				{
				
					
					
				}
		}
		
				
		public static void printList()
		{
			System.out.println(TVShows.get(0).getTitle());
			System.out.println(TVShows.get(1).getTitle());
			System.out.println(TVShows.get(2).getTitle());
			System.out.println(TVShows.get(3).getTitle());
			System.out.println(TVShows.get(4).getTitle());
		
			System.out.println(TVShows.get(0).getGenre());
			System.out.println(TVShows.get(1).getGenre());
			System.out.println(TVShows.get(2).getGenre());
			System.out.println(TVShows.get(3).getGenre());
			System.out.println(TVShows.get(4).getGenre());
			
			System.out.println(TVShows.get(0).getNumberOfSeasonsAired());
			System.out.println(TVShows.get(1).getNumberOfSeasonsAired());
			System.out.println(TVShows.get(2).getNumberOfSeasonsAired());
			System.out.println(TVShows.get(3).getNumberOfSeasonsAired());
			System.out.println(TVShows.get(4).getNumberOfSeasonsAired());
		}
				

			

	}
