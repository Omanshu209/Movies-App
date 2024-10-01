<RelativeLayout
    xmlns:android = "http://schemas.android.com/apk/res/android"
	android:id = "@+id/RelativeLayout"
    android:layout_width = "match_parent"
    android:layout_height = "match_parent"
>

    <ImageView
        android:id = "@+id/background_image"
        android:layout_width = "match_parent"
        android:layout_height = "match_parent"
        android:scaleType = "centerCrop"
        android:layout_alignParentTop = "true"
        android:layout_alignParentStart = "true"
	/>

    <LinearLayout
        android:id = "@+id/LinearLayout"
        android:layout_width = "wrap_content"
        android:layout_height = "wrap_content"
        android:orientation = "vertical"
        android:layout_alignParentBottom = "true"
        android:layout_alignParentStart = "true"
        android:layout_margin = "16dp"
	/>
	
	<LinearLayout
		android:id = "@+id/WatchMoviesLayout"
		android:layout_width = "400dp"
        android:layout_height = "500dp"
		android:orientation = "vertical"
		android:layout_alignParentBottom = "true"
        android:layout_alignParentEnd = "true"
		android:layout_margin = "16dp"
		android:gravity = "center"
		android:background = "#30000000"
	>
	
		<TextView
			android:id = "@+id/watch_movie"
			android:text = "Watch Movie"
			android:textColor = "@android:color/white"
			android:textSize = "30sp"
			android:textStyle = "bold"
			android:layout_width = "wrap_content"
			android:layout_height = "wrap_content"
			android:letterSpacing = "0.1"
		/>
	
		<GridLayout
			android:layout_width = "match_parent"
			android:layout_height = "fill_parent"
			android:orientation = "horizontal"
			android:rowCount = "1"
			android:columnCount = "3"
		>
		
			<ImageButton
				android:id = "@+id/icon_button1"
				android:layout_height = "match_parent"
				android:layout_width = "0dp"
				android:layout_columnWeight = "1"
				android:src = "@drawable/wistia"
				android:scaleType = "fitCenter"
				android:background = "@null"
			/>
		
			<ImageButton
				android:id = "@+id/icon_button1"
				android:layout_height = "match_parent"
				android:layout_width = "0dp"
				android:layout_columnWeight = "1"
				android:src = "@drawable/gdrive"
				android:scaleType = "fitCenter"
				android:background = "@null"
			/>
		
			<ImageButton
				android:id = "@+id/icon_button1"
				android:layout_height = "match_parent"
				android:layout_width = "0dp"
				android:layout_columnWeight = "1"
				android:src = "@drawable/local"
				android:scaleType = "fitCenter"
				android:background = "@null"
			/>
		
		</GridLayout>
	</LinearLayout>
</RelativeLayout>