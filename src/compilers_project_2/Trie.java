package compilers_project_2;

// Trie-based symbol table for storing tokens

public class Trie {
	// trie 
	int[] _switch = new int[52];
	char[] _symbol = new char[1000];
	int[] _next = new int[1000];
	int currentEnd = 0;
	String id = "";
	
	Trie() {
		for (int i = 0; i < 52; i++)
			_switch[i] = -1;
	}
	
	/** Add identifier **/
	public void addIdentifier(String identi) {	
		// get pointer from switch array
		id = identi;
		char valueOfSymbol = getNextSymbol();
		int ascii = (int) valueOfSymbol;
		if(ascii < 97) ascii = ascii -65;
		else ascii = ascii - 71;
		int ptr = _switch[ascii];
		
		if (ptr == -1) {
			_switch[ascii] = currentEnd;
			create(id);
		}
		else if ( id.length() != 0 ){
			valueOfSymbol = getNextSymbol();
			boolean exit = false;
			while (!exit) {
				if (_symbol[ptr] == valueOfSymbol) {
					if (id.length() != 0) {
						ptr++;
						valueOfSymbol = getNextSymbol();
					}
					else
						exit = true;
				}
				else if (_next[ptr] != 0) {
					ptr = _next[ptr];
				}
				else {
					_symbol[currentEnd] = valueOfSymbol;
					_next[ptr] = currentEnd;
					currentEnd++;
					create(id);
					exit = true;
				}
			}
		}
	}
	
	/** Get and consume char **/
	private char getNextSymbol() {
		char temp = id.charAt(0);
		id = id.substring(1);
		return temp;
	}

	/** Add new id **/
	private void create(String id) {
		int length = id.length();
		for(int i = 0; i < length; i++) {
			_symbol[currentEnd] = getNextSymbol();
			currentEnd++;
		}
		_symbol[currentEnd] = '@';
		currentEnd++;
	}
	
	/** Display trie **/
	public void display() {	
		
		// Print the switch table
		for ( int j = 0; j < Math.ceil( 52 / 20.0 ); j++ )
		{
			// Store the number of symbols parsed for efficiency
			int curLine = j * 20;
			
			System.out.print("\n\n           " );
			for( int i = 0; i < 20; i++ )
			{
				int curNum = i + curLine;
				
				// Don't go past the table limits
				if ( curNum >= 52 )
				{
					break;
				}
				
				int ascii = curNum;
				
				if( ascii < 26 ) 
				{
					ascii += 65;
				}
				else 
				{
					ascii += 71;
				}
				
				System.out.print( (char) ascii + "   " );
			}
			
			System.out.print( "\nswitch:   " );
			for( int i = 0; i < 20; i++ )
			{
				int curNum = i + curLine;
				
				// Don't go past the table limits
				if ( curNum >= 52 )
				{
					break;
				}
				
				if ( _switch[curNum] < 10 && _switch[curNum] != -1 )
				{
					System.out.print( " " + _switch[curNum] + "  " );
				}
				else
				{
					System.out.print( _switch[curNum] + "  " );
				}
			}
		}
		
		// Print the symbol table
		for ( int j = 0; j < Math.ceil( currentEnd / 20.0 ); j++ )
		{
			// Store the number of symbols parsed for efficiency
			int curLine = j * 20;
			
			System.out.print("\n\n          " );
			for( int i = 0; i < 20; i++ )
			{
				int curNum = i + curLine;
				
				if ( curNum < 10 )
				{
					System.out.print( " " );
				}
				System.out.print( curNum + "  " );				
			}
			
			System.out.print( "\nsymbol:   " );
			for( int i = 0; i < 20; i++ ) 
			{
				System.out.print( " " + _symbol[i + curLine] + "  ");
			}
			
			System.out.print( "\nnext:     " );
			for( int i = 0; i < 20; i++ ) 
			{
				if ( _next[i + curLine] < 10 )
				{
					System.out.print( " " + _next[i + curLine] + "  " );
				}
				else
				{
					System.out.print( _next[i + curLine] + "  " );
				}
			}
		}
	}
}
