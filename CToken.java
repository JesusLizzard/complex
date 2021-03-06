
public class CToken {
	final String lexeme;
	final Object literal;
	final CTokenType type;
	
	public CToken(String lexeme, Object literal, CTokenType type) {
		this.lexeme = lexeme;
		this.literal = literal;
		this.type = type;
	}
	
	public String toString() {
		return type+" "+lexeme+" "+literal;
	}
}
enum CTokenType{
	// Single-character tokens.
	  LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
	  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

	  // One or two character tokens.
	  BANG, BANG_EQUAL,
	  EQUAL, EQUAL_EQUAL,
	  GREATER, GREATER_EQUAL,
	  LESS, LESS_EQUAL,

	  // Literals.
	  IDENTIFIER, STRING, NUMBER,

	  // Keywords.
	  AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
	  PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

	  EOF
}