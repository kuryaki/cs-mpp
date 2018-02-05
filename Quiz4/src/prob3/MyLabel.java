package prob3;

public enum MyLabel implements Labebable {
	TITLE () {

		@Override
		public String getLabel() {
			return "Title Label";
		}
		
	},
	FOOTER () {

		@Override
		public String getLabel() {
			return "Footer label";
		}
		
	};
}
