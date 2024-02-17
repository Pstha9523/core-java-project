package himalayanTimes;

public class Category {
    //States
    /*
        Category Id - int
        Category Name - String
        Is Disabled - boolean
        order - int
        Is Deleted - boolean
        Created At - String
        Updated At - String
    */

        int categoryId;
        String categoryName;
        boolean isDisabled;
        int order;
        boolean isDeleted;
        String createdAt;
        String updatedAt;

        @Override
        public String toString() {
            return "Category{" +
                    "categoryId=" + categoryId +
                    ", categoryName='" + categoryName + '\'' +
                    ", isDisabled=" + isDisabled +
                    ", order=" + order +
                    ", isDeleted=" + isDeleted +
                    ", createdAt='" + createdAt + '\'' +
                    ", updatedAt='" + updatedAt + '\'' +
                    '}';
        }
    }

    //Constructors
    //Methods

