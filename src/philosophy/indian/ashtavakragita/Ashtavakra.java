package philosophy.indian.ashtavakragita;

import philosophy.indian.ashtavakragita.R;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Ashtavakra extends ListActivity {
	
	public final static String CHAPTER_NUMBER = "philosophy.indian.ashtavakragita.CHAPTER_NUMBER";
	public final static String logTag = "Ashtavakra";
	private ListView tocView;
	private TextView listItemTV;
	
	public static final String[] chapters = {
		"0. Credits",
		"1. Instruction on Self-Realization",
		"2. Joy of Self-Realization",
		"3. Test of Self-Realization",
		"4. Glorification of Self-Realization",
		"5. Four Ways to Dissolution",
		"6. The Higher Knowledge",
		"7. Nature of Self-Realization",
		"8. Bondage and Liberation",
		"9. Detachment",
		"10. Quietude",
		"11. Wisdom",
		"12. Abiding in the Self",
		"13. Happiness",
		"14. Tranquility",
		"15. Knowledge of the Self",
		"16. Special Instruction",
		"17. The True Knower",
		"18. Peace",
		"19. Repose in the Self",
		"20. Liberation-in-Life"
		};
	
	public static final String[] plainChapters = {
		"Credits",
		"Instruction on Self-Realization",
		"Joy of Self-Realization",
		"Test of Self-Realization",
		"Glorification of Self-Realization",
		"Four Ways to Dissolution",
		"The Higher Knowledge",
		"Nature of Self-Realization",
		"Bondage and Liberation",
		"Detachment",
		"Quietude",
		"Wisdom",
		"Abiding in the Self",
		"Happiness",
		"Tranquility",
		"Knowledge of the Self",
		"Special Instruction",
		"The True Knower",
		"Peace",
		"Repose in the Self",
		"Liberation-in-Life"
		};


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_ashtavakra);
        
        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.toc_textview,
        		//android.R.layout.simple_list_item_1,
                chapters));
        
     }

     public void onListItemClick(ListView parent, View v, int position,
                        long id) {
         Intent intent = new Intent(this, NewChapterActivity.class);
         intent.putExtra(CHAPTER_NUMBER, String.valueOf(position));
         startActivity(intent);
     }
     
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ashtavakra, menu);
        return true;
    }
}
