# Recycler view in android

RecyclerView is a ViewGroup added to the android studio as a successor of the GridView and ListView. <br>
It is an improvement on both of them and can be found in the latest v-7 support packages. <br>
It has been created to make possible construction of any lists with XML layouts as an item which can be customized vastly while improving on the efficiency of ListViews and GridViews. This improvement is achieved by recycling the views which are out of the visibility of the user. <br>
For example, if a user scrolled down to a position where items 4 and 5 are visible; items 1, 2, and 3 would be cleared from the memory to reduce memory consumption.

**Implementation**: To implement a basic RecyclerView three sub-parts are needed to be constructed which offer the users the degree of control they require in making varying designs of their choice.

**The Card Layout**: The card layout is an XML layout which will be treated as an item for the list created by the RecyclerView.
**The ViewHolder**: The ViewHolder is a java class that stores the reference to the card layout views that have to be dynamically modified during the execution of the program by a list of data obtained either by online databases or added in some other way.
**The Data Class**: The Data class is a custom java class that acts as a structure for holding the information for every item of the RecyclerView.

For Complete Reference:[**Recycler View**](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView)
