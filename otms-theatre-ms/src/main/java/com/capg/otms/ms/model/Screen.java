package com.capg.otms.ms.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "screen")

public class Screen {

	
		@Id
		private Integer screenId;
		private String screenName;
		
		@OneToMany(mappedBy = "screen", cascade = CascadeType.ALL)
		private List<Show> showList= new ArrayList<>();
		@DateTimeFormat(pattern = "yyyy-MM-dd ")
		private LocalDate movieEndDate;
		@Column(name = "rows_details")
		private Integer rows;
		@Column(name = "columns_details")
		private Integer columns;

		public Screen() {
			super();
		}

		public Screen(Integer screenId, Integer theatreId, String screenName, List<Show> showList,
				LocalDate movieEndDate, Integer rows, Integer columns) {
			super();
			this.screenId = screenId;
			this.screenName = screenName;
			this.movieEndDate = movieEndDate;
			this.rows = rows;
			this.columns = columns;
		}

		public Integer getScreenId() {
			return screenId;
		}

		public void setScreenId(Integer screenId) {
			this.screenId = screenId;
		}
		 
		public String getScreenName() {
			return screenName;
		}

		public void setScreenName(String screenName) {
			this.screenName = screenName;
		}

		public List<Show> getShowList() {
			return showList;
		}



		public LocalDate getMovieEndDate() {
			return movieEndDate;
		}

		public void setMovieEndDate(LocalDate movieEndDate) {
			this.movieEndDate = movieEndDate;
		}

		public Integer getRows() {
			return rows;
		}

		public void setRows(Integer rows) {
			this.rows = rows;
		}

		public Integer getColumns() {
			return columns;
		}

		public void setColumns(Integer columns) {
			this.columns = columns;
		}

		@Override
		public String toString() {
			return "Screen [screenId=" + screenId + ", theatreId=" + ", screenName=" + screenName + ", showList="
					+ ", movieEndDate=" + movieEndDate + ", rows=" + rows + ", columns=" + columns + "]";
		}

}