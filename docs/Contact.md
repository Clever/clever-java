
# Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**district** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) |  |  [optional]
**relationship** | [**RelationshipEnum**](#RelationshipEnum) |  |  [optional]
**sisId** | **String** |  |  [optional]
**students** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="PhoneTypeEnum"></a>
## Enum: PhoneTypeEnum
Name | Value
---- | -----
CELL | &quot;Cell&quot;
HOME | &quot;Home&quot;
WORK | &quot;Work&quot;
OTHER | &quot;Other&quot;
EMPTY | &quot;&quot;


<a name="RelationshipEnum"></a>
## Enum: RelationshipEnum
Name | Value
---- | -----
PARENT | &quot;Parent&quot;
GRANDPARENT | &quot;Grandparent&quot;
SELF | &quot;Self&quot;
AUNT_UNCLE | &quot;Aunt/Uncle&quot;
SIBLING | &quot;Sibling&quot;
OTHER | &quot;Other&quot;
EMPTY | &quot;&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PARENT_GUARDIAN | &quot;Parent/Guardian&quot;
EMERGENCY | &quot;Emergency&quot;
PRIMARY | &quot;Primary&quot;
SECONDARY | &quot;Secondary&quot;
FAMILY | &quot;Family&quot;
OTHER | &quot;Other&quot;
EMPTY | &quot;&quot;



