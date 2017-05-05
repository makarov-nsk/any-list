package maximmakarov.anylist.list

import android.os.Bundle
import android.support.design.widget.Snackbar
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import maximmakarov.anylist.R
import maximmakarov.anylist.item.Item
import kotlinx.android.synthetic.main.list_activity.*

/**
 * @author Maxim Makarov
 * @since 05.05.2017
 */
class ListActivity : ListView, MvpAppCompatActivity() {
    @InjectPresenter
    lateinit var presenter: ListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onItemsLoaded(items: List<Item>) {

    }
}