package com.example.demodaggermvrx.ext.userimport android.content.Contextimport android.view.LayoutInflaterimport android.view.Viewimport android.view.ViewGroupimport android.widget.BaseAdapterimport android.widget.TextViewimport com.example.demodaggermvrx.Rimport com.example.demodaggermvrx.model.Userclass UserAdapter(var context: Context,var list: List<User>) : BaseAdapter() {    override fun getCount(): Int {        return list.size    }    override fun getItem(position: Int): Any {        return list[position]    }    override fun getItemId(position: Int): Long {        TODO("Not yet implemented")    }    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {        var view:View = LayoutInflater.from(context).inflate(R.layout.list_user_item,parent,false)        var tvname=view.findViewById<TextView>(R.id.name)        tvname.text=list[position].name        var tvphone=view.findViewById<TextView>(R.id.phone)        tvphone.text=list[position].phone        return view    }}